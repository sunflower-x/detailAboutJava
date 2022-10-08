package foundation.innerClassDemo;

import java.sql.SQLOutput;

/*
 * 匿名内部类
 * */
public class OutterClassDemo3 {
    public String str = "outterStr";
    final public String finalStr = "outterFinalStr";
    static public String staticStr = "outterStaticStr";

    public static void staticMethod() {
        System.out.println("staticMethod");
    }

    public void method() {
        System.out.println("method");
    }

    Inner inner = new Inner() {
        @Override
        public void innerMethod() {
            System.out.println("OverrideInnerMethod");
            System.out.println("innerMethod");
            //内部类可以使用外部类中的属性
            System.out.println(str);
            //内部类可以使用外部类中的静态属性
            System.out.println(staticStr);
            //内部类中可以使用外部类中的常量
            System.out.println(finalStr);
            //可以使用外部类中的方法
            method();
            //可以使用外部类中的静态方法
            staticMethod();
        }
    };


    public static void main(String[] args) {
        OutterClassDemo3 outterClassDemo3 = new OutterClassDemo3();
        outterClassDemo3.inner.innerMethod();
    }
}

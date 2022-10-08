package foundation.innerClassDemo;
/*
* 在类里面的方法里定义内部类  局部内部类
* */
public class OutterClassDemo2 {
    public String str="outterStr";
    final public String finalStr="outterFinalStr";
    static public String staticStr="outterStaticStr";
    public static void staticMethod(){
        System.out.println("staticMethod");
    }
    public void method(){
        System.out.println("method");
        class InnerClass{
            public void innerMethod(){
                System.out.println("innerMethod");
                //内部类可以使用外部类中的属性
                System.out.println(str);
                //内部类可以使用外部类中的静态属性
                System.out.println(staticStr);
                //内部类中可以使用外部类中的常量
                System.out.println(finalStr);
                //可以使用外部类中的方法

                //可以使用外部类中的静态方法
                staticMethod();
            }
        }
        InnerClass innerClass = new InnerClass();
        innerClass.innerMethod();
    }
    public static void main(String[] args) {
        OutterClassDemo2 outterClassDemo2 = new OutterClassDemo2();
        outterClassDemo2.method();
    }
}

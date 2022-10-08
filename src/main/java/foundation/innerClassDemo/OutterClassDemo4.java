package foundation.innerClassDemo;

/*
 * 在类里面的方法外面定义的带static的内部类     静态内部类
 * */

public class OutterClassDemo4 {
    public String str = "outterStr";
    final public String finalStr = "outterFinalStr";
    static public String staticStr = "outterStaticStr";

    public static void staticMethod() {
        System.out.println("staticMethod");
    }

    public void method() {
        System.out.println("method");
    }

    static class InnerClass {
        public void innerMethod() {
            System.out.println("innerMethod");
            //内部类可以使用外部类中的静态属性
            System.out.println(staticStr);
            //可以使用外部类中的静态方法
            staticMethod();
        }
    }

    public static void main(String[] args) {
        OutterClassDemo4 outterClassDemo4 = new OutterClassDemo4();
        InnerClass innerClass = new InnerClass();
        innerClass.innerMethod();
    }
}


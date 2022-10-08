package foundation;

public class BreakLoop {
    /*在JAVA中如何跳出当前的多重嵌套循环？*
    方法一：可以在外面的循环语句前定义一个标号，然后在里层循环体的代码中使用带有标号的break 语句，即可跳出外层循环
    方法二：让外层的循环条件表达式的结果可以受到里层循环体代码的控制
     */
    private static void method1() {
        flag:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 3) {
                    break flag;
                }
                System.out.println(j);
            }
        }
    }

    private static void method2() {
        boolean flag = true;
        for (int i = 0; i < 10 && flag; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 3) {
                    flag = false;
                    break;
                }
                System.out.println(j);
            }

        }

    }

    public static void main(String[] args) {
        BreakLoop.method1();
        BreakLoop.method2();
    }
}

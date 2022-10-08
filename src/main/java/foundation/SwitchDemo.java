package foundation;

import java.security.PublicKey;

public class SwitchDemo {
    private static void switchWithInt(int i) {
        switch (i) {
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            default:
                System.out.println("default");
        }
    }

    private static void switchWithString(String str) {
        switch (str) {
            case "java":
                System.out.println("java");
                break;
            case "html":
                System.out.println("html");
                break;
            case "vuejs":
                System.out.println("vuejs");
                break;
            default:
                System.out.println("default");
        }
    }


    public static void main(String[] args) {
        SwitchDemo.switchWithInt(2);
        SwitchDemo.switchWithString("vuejs");
    }
}

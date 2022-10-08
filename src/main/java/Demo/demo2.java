package Demo;

public class demo2 {
    static public int test(){
        int i=1;
        try{
            return i;
        }finally {
            return ++i;

        }
    }

    public static void main(String[] args) {

        System.out.println(demo2.test());
    }
}

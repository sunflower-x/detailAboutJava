package apiDetail;

import java.util.StringTokenizer;

public class AboutStringTokenizer {
    static public void splitString(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        while (stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());
        }
    }

    public static void main(String[] args) {
        String str = "java,html,css,js,spring";
        splitString(str);
    }
}

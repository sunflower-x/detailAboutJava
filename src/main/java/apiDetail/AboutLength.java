package apiDetail;

import java.util.ArrayList;

public class AboutLength {
    /*java 中的 length属性是针对数组说的,比如说你声明了一个数组,想知道这个数组的长度则用到了 length 这个属性.
        java 中的 length() 方法是针对字符串说的,如果想看这个字符串的长度则用到 length() 这个方法.
        java 中的 size() 方法是针对泛型集合说的,如果想看这个泛型有多少个元素,就调用此方法来查看!*/
    private int arrayLength(int[] array) {
        return array.length;
    }

    private int stringLength(String str) {
        return str.length();
    }

    private int collectionLength(ArrayList<String> arrayList) {
        return arrayList.size();
    }

    public static void main(String[] args) {
        AboutLength demo1 = new AboutLength();
        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println(demo1.arrayLength(array));
        String str = "thomas";
        System.out.println(demo1.stringLength(str));
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("java");
        arrayList.add("javascript");
        arrayList.add("vue");
        System.out.println(demo1.collectionLength(arrayList));

    }
}

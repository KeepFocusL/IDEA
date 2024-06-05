package day240531;

import java.util.ArrayList;

public class CollectionCommonMethod2 {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("123");
        stringList.add("abc");
        stringList.add("qwe");
        System.out.println(stringList);
        stringList.remove("abc");
        System.out.println(stringList);

        System.out.println("=== === ===");

        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        //integerList.remove(new Integer(2));
        integerList.remove(Integer.valueOf(2));
        System.out.println(integerList);
    }
}

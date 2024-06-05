package day240531;

import java.util.ArrayList;

public class ArrayListReadingSourceCode {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        // 通过阅读 ArrayList 源码，我们知道：
        // 1. 底层是用 Object[] elementData 来存储的
        // 2. 当只是 new ArrayList<>() 的时候，这个还没给它指定大小
        //    跟 StringBuilder 不一样，StringBuilder 只要 new 出来，哪怕还没 append，就已经分配长度16了
        // 3. 什么时候真正开始给 Object[] 指定长度？ => add 的时候（when first element is added）
        arrayList.add("abc");
        //    第一次分配的是，长度是多少？ => Math.max(DEFAULT_CAPACITY, minCapacity)
        System.out.println(Math.max(10, 18));

        arrayList.add("efg");
        arrayList.add("qwe");

        System.out.println("=== === ===");

        // 类似 new 出 StringBuilder 之后，可以一直 append(...)
        StringBuilder stringBuilder = new StringBuilder();
        //stringBuilder.append("abc").append("efg").append("qwe");
    }
}

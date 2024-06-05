package day240531;

import java.util.ArrayList;
import java.util.Collection;

@SuppressWarnings({"all"})
public class CollectionCommonMethod {
    public static void main(String[] args) {
        Collection<String> al = new ArrayList<>();
        System.out.println(al.isEmpty());
        al.add("123");
        al.add("abc");
        al.add("qwe");
        // 遇到新的类型，可以直接打印出来。如果不是地址，说明重写了 toString 方法
        // 从阅读重写之后的 toString 方法又可以获取一些新的知识（Iterator）
        System.out.println(al);
        System.out.println(al.toString());

        // `.` 点。探索不熟悉的类或者对象，可以大胆的去`点`它，借助编辑器的提示功能，发现新东西
        System.out.println(al.isEmpty());
        System.out.println(al.size());
        System.out.println(al.contains("abc"));

        System.out.println("=== === ===");

        // 复习 instanceof
        /*if (al instanceof ArrayList) {
            ArrayList<String> arrayList = (ArrayList<String>) al;
        }*/

        if (al instanceof ArrayList arrayList) {
            // 以 Collection 视角来看，没有 get 方法
            // 以 ArrayList 视角来看，有 get 方法，方便访问元素
            // 通过阅读源码，发现，其实以 List 视角就已经有 get 方法
            System.out.println(arrayList.get(0));
            System.out.println(arrayList.get(1));
            System.out.println(arrayList.get(2));
        }
    }
}

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
    }
}

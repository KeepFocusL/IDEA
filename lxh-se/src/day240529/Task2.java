package day240529;

import java.io.File;
import java.util.Arrays;

/**
 * 任务2: 引出 File 以及常用方法
 */
public class Task2 {
    public static void main(String[] args) {
        File file1 = new File("src/day240522");
        System.out.println(file1.toString());
        System.out.println(file1.getName());
        System.out.println(file1.isFile());
        System.out.println(file1.isDirectory());
        String[] list = file1.list();
        System.out.println(Arrays.toString(list));
        //MySortUtil.print(list);
        File[] files = file1.listFiles();
        System.out.println(Arrays.toString(files));

        System.out.println("=== === ===");

        File file2 = new File("src/day240525/string_demo/MyStringBuilder.java");
        System.out.println(file2);
        System.out.println(file2.getName());
        System.out.println(file2.isFile());
        System.out.println(file2.isDirectory());
        String[] list1 = file2.list();
        System.out.println(Arrays.toString(list1));


        System.out.println("=== === ===");
        File file = new File(".DS_Store");
        System.out.println(file.isHidden());
    }
}

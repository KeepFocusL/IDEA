package day240529;

import java.io.File;

/**
 * 用树形的格式展示某个目录下的所有文件夹和文件
 * 每多一级，文件名的前面多显示两个减号 `--`
 */
public class Task5 {
    public static void main(String[] args) {
        File directory = new File("src/day240515");
        print(directory, 0);
    }

    public static void print(File file, int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("--");
        }

        System.out.println(file.getName());

        if (file.isDirectory()) {
            File[] files = file.listFiles();
            if (files != null) {
                for (File f : files) {
                    print(f, level + 1);
                }
            }
        }
    }
}
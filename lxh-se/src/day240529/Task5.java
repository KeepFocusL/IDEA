package day240529;

import java.io.File;

/**
 * 用树形的格式展示某个目录下的所有文件夹和文件
 * 每多一级，文件名的前面多显示两个减号 `--`
 */
public class Task5 {
    public static void main(String[] args) {
        File directory = new File("src/day240515");
        print(directory, "");
    }

    public static void print(File file, String indent) {
        String suffix = "";
        if (file.isFile()) {
            long length = file.length();
            suffix = " ("+length+"字节)";
        }
        System.out.println(indent + file.getName() + suffix);

        if (file.isDirectory()) {
            File[] files = file.listFiles();
            if (files != null) {
                for (File f : files) {
                    print(f, indent + "--");
                }
            }
        }
    }
}

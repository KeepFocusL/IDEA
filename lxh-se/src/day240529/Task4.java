package day240529;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Task4 {
    static Map<String, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        File rootDir = new File("src");
        countingFileType(rootDir);
        System.out.println(map);
    }

    private static void countingFileType(File file) {
        File[] files = file.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.isDirectory()) {
                    countingFileType(f);
                } else {
                    String name = f.getName();
                    String ext = getFileExtension(name);
                    if (map.containsKey(ext)) {
                        map.put(ext, map.get(ext) + 1);
                    } else {
                        map.put(ext, 1);
                    }
                }
            }
        }
    }

    private static String getFileExtension(String filename) {
        // 要考虑无后缀名的情况
        return filename.substring(filename.lastIndexOf(".") + 1);
    }
}

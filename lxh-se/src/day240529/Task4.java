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
        // 真正做统计
        map.put("jpg", 1);
        map.put("txt", 3);
        map.put("java", 5);
    }

}

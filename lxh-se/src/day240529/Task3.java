package day240529;

import java.util.HashMap;
import java.util.Map;

/**
 * 补充介绍：集合之 Map<K, V>
 *
 * 备注：后续会详细介绍
 */
public class Task3 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("jpg", 1);
        map.put("txt", 3);
        map.put("java", 5);

        Integer i = map.get("jpg");
        System.out.println(i);

        // 分析了一个文件名，发现它是 jpg
        if (map.containsKey("jpg")) {
            Integer i1 = map.get("jpg");
            map.put("jpg", i1 + 1);
        } else {
            map.put("xxx", 1);
        }

        System.out.println(map.get("jpg"));

        System.out.println(map);
    }
}


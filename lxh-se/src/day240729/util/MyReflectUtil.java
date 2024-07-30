package day240729.util;

import java.lang.reflect.Constructor;

public class MyReflectUtil {
    public static <T> T getInstance(String clazzName) {
        T instance;
        try {
            Class<?> downloaderClass = Class.forName(clazzName);
            Constructor<?> declaredConstructor = downloaderClass.getDeclaredConstructor();
            instance = (T) declaredConstructor.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return instance;
    }
}
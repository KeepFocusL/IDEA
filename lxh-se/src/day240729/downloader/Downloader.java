package day240729.downloader;

import java.lang.reflect.Constructor;

public abstract class Downloader {
    public static Downloader getDownloader(String downloaderName) {
        Downloader dl;
        try {
            Class<?> downloaderClass = Class.forName(downloaderName);
            Constructor<?> declaredConstructor = downloaderClass.getDeclaredConstructor();
            dl = (Downloader) declaredConstructor.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return dl;
    }

    public abstract String download(String url);
}

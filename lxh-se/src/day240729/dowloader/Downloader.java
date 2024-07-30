package day240729.dowloader;

public abstract class Downloader {
    public static Downloader getDownloader(String downloaderName) {
        // 1. 从配置文件获取获取 downloader 配置的值
        // 2. if ... else
        Downloader downloader;
        if ("nope".equals(downloaderName)) {
            downloader = new NopeDownloader();
        } else if ("jsoup".equals(downloaderName)){
            downloader = new JsoupDownloader();
        } else {
            downloader = null;
        }
        return downloader;
    }

    public abstract String download(String url);
}

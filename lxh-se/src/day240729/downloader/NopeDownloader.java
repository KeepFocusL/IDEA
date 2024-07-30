package day240729.downloader;

public class NopeDownloader extends Downloader {


    @Override
    public String download(String url) {
        System.out.println("NopeDownloader - " + "正在下载 - " + url);
        return "这里什么都不做,找其他人(实现类)做";
    }
}


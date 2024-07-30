package day240729.downloader;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class JsoupDownloader extends Downloader {
    @Override
    public String download(String url) {
        String html;
        try {
            Document document = Jsoup.connect(url).get();
            html = document.html();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("JsoupDownloader - " + "正在下载 - " + url);
        System.out.println(html);
        return html;
    }
}

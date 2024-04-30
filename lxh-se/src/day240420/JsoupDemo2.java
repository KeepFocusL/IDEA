package day240420;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class JsoupDemo2 {
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://so.gushiwen.cn/gushi/shijing.aspx/").get();
        Elements as = doc.select("div.left div.sons a");
        System.out.println("当前网页列出的总共有" + as.size() + "篇");
        System.out.println("他们的标题是" + as.eachText());
    }
}

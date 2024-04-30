package day240420;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class JsoupDemo1 {
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://baidu.com/").get();
        //获取xit官网首页的html源代码
        System.out.println(doc.html());
        //获取xit官网首页的标题 -方法一 - 自己最原始的思路
        Elements es = doc.getElementsByTag("title");
        System.out.println(es.size());
        System.out.println(es.get(0).html());
        //获取xit官网首页的标题 - 方法二 - 用更方便的方法
        //     -通过看这个方便方法的原码，其实它也是用了我们自己最原始思路的方法
        System.out.println(doc.title());
    }
}

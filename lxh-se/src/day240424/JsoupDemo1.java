package day240424;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class JsoupDemo1 {
    public static void main(String[] args) throws IOException {
        Document document = Jsoup.connect("http://bbs.xmfish.com/thread-htm-fid-55.html%22").get();
        Elements es = document.select("tbody[id=threadlist]").select("tr[class=tr3]");
        System.out.println(es.size());


    }
}

package day240729.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

public class XmfishParser implements Parser {
    @Override
    public List<String> parse(String html) {
        Document document = Jsoup.parse(html);
        List<String> results = new ArrayList<>();
        Elements es = document.select("tbody[id=threadlist]").select("tr[class=tr3]");
        for (Element e : es) {
            // 过滤公告、置顶
            Element noticeAndTop = e.select("td.icon a i").first();
            if (noticeAndTop.hasAttr("alt") && "置顶帖标志".equals(noticeAndTop.attr("alt"))) {
                continue;
            }

            Element titleElement = e.select("td.subject a.subject_t").first();
            String title = titleElement.text();
            results.add(title);
        }
        return results;
    }
}

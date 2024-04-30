package day240424;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupDemo3 {
    public static void main(String[] args) throws Exception {
        /*
        http://bbs.xmfish.com/thread-htm-fid-55-search-all-orderway-postdate-asc-DESC-page-1.html
         */
        Document document = Jsoup.connect("http://bbs.xmfish.com/thread-htm-fid-55.html").get();
        // + 你的想象力...
        // 你的代码
        Elements es = document.select("tbody[id=threadlist]").select("tr[class=tr3]");
        System.out.println(es.size());

        // target
        String target = "咖啡";

        // 循环遍历
        for (Element e : es) {
            // 过滤公告、置顶
            Element noticeAndTop = e.select("td.icon a i").first();
            if (noticeAndTop.hasAttr("alt") && "置顶帖标志".equals(noticeAndTop.attr("alt"))) {
                continue;
            }

            // 解析数据
            Element titleElement = e.select("td.subject a.subject_t").first();
            String title = titleElement.text();
            String url = titleElement.attr("href");
            url = "http://bbs.xmfish.com/" + url;
            String createdAt = e.select("td.author").first().select("p").text();
            /*System.out.println("标题：" + title);
            System.out.println("链接：" + url);
            System.out.println("发布时间：" + createdAt);
            System.out.println("----------");*/

            // 关键词判断
            if (title.contains(target)) {
                System.out.println("命中了你设置的关键词：" + target);
                System.out.println("标题：" + title);
                System.out.println("链接：" + url);
                System.out.println("发布时间：" + createdAt);
                System.out.println("~~~ --- ~~~");
                String msg = "命中了你设置的关键词：" + target + "<br>" +
                        "标题：" + title + "<br>" +
                        "链接：" + url + "<br>" +
                        "发布时间：" + createdAt;

                MyEmailUtil.send("1281438594@qq.com", msg);
            }
        }
    }
}
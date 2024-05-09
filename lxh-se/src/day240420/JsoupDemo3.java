package day240420;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class JsoupDemo3 {
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://cn.bing.com/sportsdetails?q=%E8%8B%B1%E8%B6%85%E6%8E%92%E5%90%8D&sport=Soccer&scenario=League&TimezoneId=China%20Standard%20Time&league=Soccer_EnglandPremierLeague&intent=Standings&seasonyear=2023&segment=sports&isl2=true&form=ANAB01&").get();
        Elements as = doc.select("tr.bsp_row_item td.bsp_td_fixed");
        Elements element = doc.select("div.b_antiSideBleed");
        System.out.println("2023-2024赛季英超球队排名" + as.eachText());
        System.out.println("2023-2024赛季英超球队排名详细数据"+element.eachText());

    }
}

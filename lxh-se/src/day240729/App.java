package day240729;

import day240729.dowloader.Downloader;
import day240729.dowloader.NopeDownloader;

import javax.swing.text.html.parser.Parser;


public class App {
    public static void main(String[] args) {

        //读取配置文件
        System.out.println("文件配置设置完成!");

        //=== === ===
        //以boss的视角，定义规范
        //定义具体的落地(黑盒子的思想):抽象类/接口
        //Downloader
        //抽象类不能直接new出,写一个方法继承他实现
        Downloader downloader = new NopeDownloader();
        String html = downloader.download("http://bbs.xmfish.com/thread-htm-fid-55-search-all-orderway-postdate-asc-DESC-page-1.html");
        System.out.println(html);
        System.out.println("downloader - 下载完成");

        //Parser
        Parser parser = new Parser();
        //把downloader传入parser中解析
        
        //Repository


        //Notificator
    }
}

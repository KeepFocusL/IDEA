package day240729;

import day240729.parser.Parser;

import javax.jnlp.DownloadService;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        //读取配置文件
        System.out.println("文件配置设置完成");

        //=== === ===
        //以boss的视角，定义规范
        //定义具体的落地(黑盒子的思想):抽象类/接口
        //Downloader
        Downloader downloader = new Downloader();

        //Parser

        //Repository



        //Notificator
    }
}

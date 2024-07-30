package day240729;

import day240729.dowloader.Downloader;
import day240729.notificator.NopeNotificator;
import day240729.notificator.Notificator;
import day240729.parser.DefaultParser;
import day240729.parser.Parser;
import day240729.repository.NopeRepository;
import day240729.repository.Repository;

import java.io.File;
import java.io.FileReader;
import java.util.List;
import java.util.Properties;

public class App {
    public static void main(String[] args) throws Exception {
        // 读取配置文件
        System.out.println("配置文件读取成功");
        // === --- ===
        Properties properties = new Properties();
        File file = new File("src/day240729/project/config.properties");
        properties.load(new FileReader(file));
        System.out.println(properties);
        System.out.println("从配置文件读取出来的 url=" + properties.getProperty("url"));
        System.out.println("从配置文件读取出来的 keywords=" + properties.getProperty("keywords"));
        // === --- ===

        // === === ===
        // 以 Boss 的视角，定义规范
        // 定义规范的具体落地（黑盒子的思想）：抽象类/接口
        // Downloader
        Downloader downloader = Downloader.getDownloader(properties.getProperty("downloader"));

        String html = downloader.download(properties.getProperty("url"));
        System.out.println(html);
        System.out.println("Downloader - 下载完成");

        // Parser
        System.out.println("Parser - 正在解析...");
        Parser parser = new DefaultParser();
        List<String> result = parser.parse(html);
        System.out.println(result);
        System.out.println("Parser - 解析完成");

        // Repository
        System.out.println("Repository - 正在存储...");
        Repository repository = new NopeRepository();
        repository.store(result);
        System.out.println("Repository - 存储完成");

        // Notificator
        System.out.println("Notificator - 正在通知...");
        Notificator notificator = new NopeNotificator();
        notificator.notice(result, properties.getProperty("keywords"));
        System.out.println("Notificator - 通知完成！");
    }
}

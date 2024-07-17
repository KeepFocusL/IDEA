package day240525.string_demo;

public class StringCommonMethod2 {
    public static void main(String[] args) {
        //1.隐藏手机号码的中间几位，用*替代
        //比如：18898765432，需要显示效果：188****5432
        String s1 = "18898765432";
        System.out.println(s1.replace("9876", "****"));

        //2.判断某个字符串，在另一个字符串中出现的次数
        //比如：s3 中出现了多少次 s2
        String s2 = "sb";
        String s3 = "abcsb98jlsbfdjsasbyiuresbowqsbjoa";
        System.out.println(s3.indexOf(s2)); //返回指定字符第一次出现的位置
        int i = s3.indexOf(s2);
        System.out.println(i);
        System.out.println(s3.substring(i));
        //3。敏感词库功能：“包子"、"SB"、“良心”
        // 比如：用户发的微博内容是“早上买的包子实惠有好吃，店老板说他自己是SB，但是良心还是有的。
        // 需要的显示效果：早上买的**实惠有好吃，店老板说他自己是**，但是**还是有的。
        String[] words = new String[]{"包子", "SB", "良心"};
        String s4 = "早上买的包子实惠有好吃，店老板说他自己是SB，但是良心还是有的。";

    }
}

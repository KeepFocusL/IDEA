package day240525.string_interview;

public class StringTest {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        String sq = new String("xyz");
        String sz = new String("xyz");
        System.out.println(sq == sz);
        System.out.println(sq.equals(sz));

        System.out.println("=== === ===");

        String sa = "xyz"; //"xyz"=字面量 , sa =变量
        String sb = "xyz";
        System.out.println(sa == sb);

        System.out.println("=== === ===");

        String s1 = "Java";
        String s2 = "2312";

        String s3 = "Java2312";

        String s4 = "Java" + "2312";
        String s5 = s1 + "2312";
        String s6 = "Java" + s2;
        String s7 = s1 + s2;

        System.out.println(s3 == s4);//字符串字面量 + 字符串字面量 ---> 优化 ---> 常量池
        System.out.println(s3 == s5);
        System.out.println(s3 == s6);
        System.out.println(s3 == s7);
        System.out.println(s4 == s5);
        System.out.println(s5 == s6);
        System.out.println(s6 == s7);

        String s8 = s6.intern();//.intern() 要求主动走常量池，而不是走s6中的s2地址
        System.out.println(s3 == s8);
    }
}

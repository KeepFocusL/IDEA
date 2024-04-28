package day240111;

/**
String 类型变量的使用
 - 引用数据类型，字符串
 - ""
 - 运用: String+ Primitive Date Types
 - result: String

 */

public class StringBasic {
    public static void main(String[] args) {
        String msg = "HelloWorld!";
        System.out.println(msg);

        String single = "a";
        String emptyString = "";
        //char emptyChar = "";

        System.out.println("=== === ===");

        String prefix = " 百搭：";
        //byte\short\int\long float\double char boolean

        byte vb = 1;
        System.out.println(prefix + vb);

        short cb = 2;
        System.out.println(prefix + cb);

        int as = 4;
        System.out.println("prefix=" + as);

        long zz = 8L;
        System.out.println("prefix=" + zz);

        System.out.println("=== === ===");

        float qa = 4F;
        System.out.println("prefix=" + qa);

        double lt = 8;
        System.out.println("prefix=" + lt);

        System.out.println("=== === ===");

        char c1 = 'a';
        System.out.println("prefix=" + c1);

        System.out.println("=== === ===");

        //day240130.Practice 1
        char c = 'a';

    }}

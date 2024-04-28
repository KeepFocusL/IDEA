package day240106;

public class DataTypes {
    public static void main(String[] args) {
        /*  整型:
        byte: 8-bit, 1字节, -128 to 127
        short: 16-bit,2字节, -32767, -2^15 ~32767 , 2^15
        int: 32-bit,4字节， -2^31 ~ 2^31-1,约21亿
        long: 64-bit,8字节， -2^63 ~ 2^63-1
         */
        byte from = -128;
        byte to = 127;
        System.out.println(from);
        System.out.println(to);
        //to = 128;

        short size = 128;
        // 常用 int
        int commonUse = 1234;
        // long L/l

        long big = 3414234324L;
        System.out.println(big);

        /*
        浮点型：
        float:单精度，32-bit，4字节，-3.403E38 ~ 3.403E38
        double:双精度，64-bit，8字节，-1.798E308~1.798E308
         */
        double double1 = 128.8;
        System.out.println(double1);
        // F/f
        float float1 = 18.8f;
        /*float float1 = 18.8f;
        System.out.println(float1); */

        char c1 = 'a';
        System.out.println(c1);
        char c2 = '8';
        char c3 = '好';
        char c4 = 'q';
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        // 转义字符
        char c5 ='\n';//换行符
        //c5 = '\t';//制表符
        System.out.print("Hello" + c5);
        System.out.println("World");
        // Unicode
        // https://zh,wikipedia.org/wik
        char c6 = '\u0043';
        System.out.println(c6);
        // === === ===
            /*
        布尔型:
        boolean: true/false
                */
        // 常用于条件判断
        boolean boolean1 = true;
        System.out.println(boolean1);

        boolean result = true;
        if (result) {
            System.out.println("恭喜你");
        } else {
            System.out.println("池中鱼");
        }
    }
}
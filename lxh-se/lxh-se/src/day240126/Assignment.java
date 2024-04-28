package day240126;

/**
 * Assignment Operators
 *
 * =
 * += -= *= /= %=
 */
public class Assignment {
    public static void main(String[] args) {
        // 赋值符号 =
        int i1 = 10;
        int j1 = 10;

        // 连续声明
        int i2, j2;
        // 连续赋值
        i2 = j2 = 10;

        // 连续声明+赋值
        int i3 = 10, j3 = 20;

        // === === ===

        int num1 = 10;
        /*
        num1 = num1 + 2;
         */
        num1 += 2;
        System.out.println(num1);

        int num2 = 12;
        /*
        num2 = num2 % 5;
         */
        num2 %= 5;
        System.out.println(num2);

        short s1 = 10;
        //s1 = s1 + 2;
        s1 += 2;
        System.out.println(s1);

        // +2
        /*
        方式一：num = num + 2;
        方式二：num += 2;
         */
        int nb = 8;
        int i = nb + 2;
        nb += 2; // 常见

        // +1
        /*
        方式一：num = num + 1;
        方式二：num += 1;
        方式三：num++;
         */
        int j = 5;
        j += 1;
        ++j;
        j++; // 常见
    }
}
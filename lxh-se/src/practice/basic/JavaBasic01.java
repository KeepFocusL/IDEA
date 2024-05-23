package practice.basic;

import java.util.Scanner;

/**
 * 1、【回文数】
 * 打印5位数中的所有回文数，每行打印10个数。最后统计一下一共有多少个5位回文数。
 * 注：回文数即正反读都是一个数，5位数的话，只要个位与万位相同，十位与千位相同就是一个回文数。
 */
public class JavaBasic01 {
    public static void main(String[] args) {
        //1.自己用
        //打印回文数个数
        int count = 0;
        //Dig_1表示个位数字，Dig_2表示十位数字，Dig_3表示百位数字
        for (int Dig_1 = 1; Dig_1 < 10; Dig_1++)
            for (int Dig_2 = 0; Dig_2 < 10; Dig_2++)
                for (int Dig_3 = 0; Dig_3 < 10; Dig_3++) {
                    System.out.print(Dig_1 + "" + Dig_2 + "" + Dig_3 + "" + Dig_2 + "" + Dig_1 + "     ");
                    count++;
                    if (count % 10 == 0)
                        System.out.println();
                }
        System.out.println("5位回文数的个数是：" + count + "个");

        System.out.println("=== === ===");

        //2.别人用
        //另外给出 判断输入的数是否是回文数的算法
        Scanner input = new Scanner(System.in);
        System.out.print("请输入需要判断的数(位数不限):");
        int n = input.nextInt();
        boolean flag = true;

        //或者采用num%10、num/10的循环方式，将其存入int型数组
        String s = Integer.toString(n); //将输入的正整数转换成字符串
        char arr[] = s.toCharArray();   //将字符串存入字符数组

        for (int i = 0; i < arr.length / 2; i++)
            if (arr[i] != arr[arr.length - i - 1]) {  //数组中从左向右数第i个数对应从左向右数第arr.length - i - 1个数(从右向左为第i个数)
                flag = false;
                System.out.print("您输入的数不是回文数！");
                break;
            }
        if (flag)
            System.out.print("您输入的数是回文数！");
        input.close();

    }
}

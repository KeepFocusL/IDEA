package day240126;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个大于等于100，小于等于999的数:");
        int num = sc.nextInt();

        int hundreds = num / 100; //取商
        int tens = num / 10 % 10; //取商 取余
        int units = num % 10; //取余
        System.out.println("百位为:"+ hundreds);
        System.out.println("十位为:"+ tens);
        System.out.println("个位为:"+ units);
        }
    }


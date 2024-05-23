package shomework.h3;

import java.util.Random;
import java.util.Scanner;

public class LotteryTicket1 {
    public static void main(String[] args) {
        System.out.println("欢迎来到猜彩票游戏");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请选择两位数号码：");
        int num = scanner.nextInt();

        Random random = new Random();
        //第一个数0~8，后面+1变成1~9第一个数没有0
        int num1 = random.nextInt(9) + 1;
        //第二个数0~9
        int num2 = random.nextInt(10);
        System.out.println("中奖号码：" + num1 + num2);
        if (num == num1 && num == num2) {
            System.out.println("奖金10000元");
        } else if (num == num2 && num == num1) {
            System.out.println("奖金3000元");
        } else if (num == num1 & num != num2 || num != num1 & num == num2) {
            System.out.println("奖金1000元");
        } else if (num == num2 & num != num1 || num != num2 & num == num1) {
            System.out.println("奖金500元");
        } else {
            System.out.println("很遗憾你没有中奖");
        }
    }
}
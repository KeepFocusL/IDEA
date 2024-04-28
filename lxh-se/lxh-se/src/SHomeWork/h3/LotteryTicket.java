package SHomeWork.h3;

import java.util.Random;
import java.util.Scanner;

public class LotteryTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请选择两位数号码：");
        int num = scanner.nextInt();

        Random random = new Random();
        //随机0~89的数，后面+10变成10~99
        int num1 = random.nextInt(90) + 10;
        System.out.println("中奖号码：" + num1);
        if (num == num1) {
            System.out.println("奖金10000元");
        }else {
            System.out.println("很遗憾你没有中奖");
        }
    }
}

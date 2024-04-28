package SHomeWork.h2;

import java.util.Scanner;

public class RSC {
    public static void main(String[] args) {
        System.out.println("欢迎来到猜拳游戏");
        while (true) {
            System.out.println("俩位选手请选择(石头、剪刀、布)");
            System.out.println("第一个选手请出拳");
            Scanner sc = new Scanner(System.in);
            String num = sc.next();
            System.out.println("第二个选手请出拳");
            Scanner sc1 = new Scanner(System.in);
            String num1 = sc.next();
            if (num.equals("石头") && num1.equals("剪刀")) {
                System.out.println("第一位选手赢");
            } else if (num.equals("石头") && num1.equals("布")) {
                System.out.println("第二位选手赢");
            } else if (num.equals("石头") && num1.equals("石头")) {
                System.out.println("平局");
            } else if (num.equals("剪刀") && num1.equals("布")) {
                System.out.println("第一位选手赢");
            } else if (num.equals("剪刀") && num1.equals("石头")) {
                System.out.println("第二位选手赢");
            } else if (num.equals("剪刀") && num1.equals("剪刀")) {
                System.out.println("平局");
            } else if (num.equals("布") && num1.equals("布")) {
                System.out.println("平局");
            } else if (num.equals("布") && num1.equals("石头")) {
                System.out.println("第一位选手赢");
            } else if(num.equals("布") && num1.equals("剪刀")) {
                System.out.println("第二位选手赢");
            }
        }
    }
}


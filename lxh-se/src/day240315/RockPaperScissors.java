package day240315;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        System.out.println("欢迎来到石头剪刀布游戏");
        while (true) {
            System.out.println("请选择(石头、剪刀、布)");
            Scanner userInput = new Scanner(System.in);
            String user = userInput.next();
            String[] rps = new String[]{"石头","剪刀","布"};
            Random computerChoice = new Random();
            int randomIndex = computerChoice.nextInt(rps.length);
            if (user.equals("石头") && computerChoice.equals("剪刀")) {
                System.out.println("第一位选手赢");
            } else if (user.equals("石头") && computerChoice.equals("布")) {
                System.out.println("第二位选手赢");
            } else if (user.equals("石头") && computerChoice.equals("石头")) {
                System.out.println("平局");
            } else if (user.equals("剪刀") && computerChoice.equals("布")) {
                System.out.println("第一位选手赢");
            } else if (user.equals("剪刀") && computerChoice.equals("石头")) {
                System.out.println("第二位选手赢");
            } else if (user.equals("剪刀") && computerChoice.equals("剪刀")) {
                System.out.println("平局");
            } else if (user.equals("布") && computerChoice.equals("布")) {
                System.out.println("平局");
            } else if (user.equals("布") && computerChoice.equals("石头")) {
                System.out.println("第一位选手赢");
            } else if(user.equals("布") && computerChoice.equals("剪刀")) {
                System.out.println("第二位选手赢");
            }
        }
    }
}
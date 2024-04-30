package day240126;

import java.util.Scanner;

public class DisplayWeekTest {
    public static void main(String[] args) {
        String[] weeks = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数值（1-7）：");
        int day = scanner.nextInt();

        if(day < 1 || day > 7){
            System.out.println("你输入的数据有误，请重新输入");
        }else{
            System.out.println(weeks[day - 1]);
        }

        scanner.close();
    }
}

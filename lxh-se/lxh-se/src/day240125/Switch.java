package day240125;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入月份");
        int mouth = scanner.nextInt();
        switch (mouth){
            case 1,3,5,7,8,10,12:
                System.out.println("该月份有30天");
                break;
            case 2:
                System.out.println("该月份有28天");
                break;
            case 4,6,9,11:
                System.out.println("该月份有31天");
                break;
            default:
                System.out.println("输入有误！");
                break;

        }
    }
}

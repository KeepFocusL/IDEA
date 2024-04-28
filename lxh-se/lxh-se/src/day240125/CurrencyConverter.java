package day240125;

import java.util.Scanner;

public class CurrencyConverter {
    //快捷键：psvm 或 main
    public static void main(String[] args){
        //提示信息
        System.out.println("请输入美元金额");

        //当前的汇率
        double exchangeRate = 7.1522;

        //接受用户输入
        Scanner scanner = new Scanner(System.in);
        //用什么数据类型存储
        double input = scanner.nextDouble();
        //做计算
        double result = exchangeRate * input;

        System.out.println("当前汇率:1美元约等于" + exchangeRate + "人民币");
        System.out.println("按当前汇率计算之后对应人民币金额为:" + result);
    }
}

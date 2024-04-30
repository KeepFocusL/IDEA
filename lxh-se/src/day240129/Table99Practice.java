package day240129;

public class Table99Practice {
    public static void main(String[] args) {
        /*//找到核心代码
        System.out.println("1*1=1");*/

        /*//打印9次
        for (int i = 1 ;  i <= 9;i++){
            System.out.println("1*1=1");*/

        /*//让第一个数值动态化
            for (int i = 1; i <=9 ; i++) {
                System.out.println(i+"*1=1");*/

        //再找出列
        /*for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println(i +" * "+ j + " = " + i * j);*/

        //再由竖列变成横列
        /*for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " * " + j + " = " + i * j);*/

        //再加一个空格使结果美观
        /*for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i +" * "+ j + " = " + i * j + "   ");*/

        //再运算结束后加一个sout
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i +" * "+ j + " = " + i * j + "   ");
            }
            System.out.println();
        }
    }
}
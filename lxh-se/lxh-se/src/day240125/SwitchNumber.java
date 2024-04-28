package day240125;

public class SwitchNumber {
    public static void main(String[] args) {
        int x = 9;
        int y = 8;

        //交换两个数的值
        int temp = x;
        x = y;
        y = temp;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
}
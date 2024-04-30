package day240111;

// 1. import
import java.util.Scanner;

/**
 * Scanner
 *
 * InputMisMatchException
 */
public class ScannerTest {
    public static void main(String[] args) {
        // 2. new
        Scanner scan = new Scanner(System.in);

        //3. using
        System.out.println("姓名：(String)");
        String name = scan.next();
        System.out.println("你输入的姓名是：" + name);

        System.out.println("年龄：(int)");
        int age = scan.nextInt();
        System.out.println("你输入的年龄是：" + age);

        System.out.println("体重：(double)");
        double weight = scan.nextDouble();
        System.out.println("你输入的体重是：" + weight);

        System.out.println("婚否？(boolean)");
        boolean maritalStatus = scan.nextBoolean();
        System.out.println("是否结婚：" + maritalStatus);
    }
}
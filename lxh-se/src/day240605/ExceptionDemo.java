package day240605;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        //java.lang.StackOverflowError
        //m();

        //java.lang.OutOfMemoryError: Java heap space
        //String[] s = new String[1024 * 1024 * 1024];

        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
    }

    public static void m() {
        m();
    }
}

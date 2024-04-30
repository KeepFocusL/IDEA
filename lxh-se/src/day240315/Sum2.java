package day240315;

public class Sum2 {

    public static int sum(int n) {
        if (n == 1) return 1;
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        int n = 100;
        System.out.println(sum(n));
    }
}

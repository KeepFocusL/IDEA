package day240313;


/*
 * 斐波那契数列 Fibonacci
 * 1  1  2  3  5  8  13  21  34  55  ...
 *
 * f(n) = f(n - 1) + f(n - 2)
 * */
public class Fibonacci {
    public int getFibonacciNumber(int position) {
        if (position == 1) {
            return 1;
        } else if (position == 2) {
            return 1;
        } else {
            // n = 3 ===> f(3) = f(2) + f(1)
            //                   f(3-1) + f(3-2)
            //
            // n = 4 ===> f(4) = f(3) + f(2)
            //                   f(4-1) + f(3-1)
            //
            // ....
            return getFibonacciNumber(position - 1) + getFibonacciNumber(position - 2);
        }
    }
}
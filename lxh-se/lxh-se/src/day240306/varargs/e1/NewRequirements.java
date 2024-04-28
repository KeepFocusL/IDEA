package day240306.varargs.e1;

public class NewRequirements {
    public static void main(String[] args) {
        // 思考：写一个方法，支持一下功能
        // 功能1: 两个整数的加法
        System.out.println(add(2, 3));
        // 功能2: 三个整数的加法
        System.out.println(add(3, 4, 5));
        // 功能3: N个整数的加法
        System.out.println(add(6, 7, 8, 9));
    }

    /*public static int add(int a, int b) {
        return a + b;
    }*/

    // 如果没特殊要求，可以新写一个方法
    // 继续思考：不能新增方法，如何调整
    /*public static int add(int a, int b, int c) {
        return a + b + c;
    }*/

    public static int add(int... a) {
        // 先直接返回 0
        // 重点在于验证：是否可以同时支持不确定的参数
        // 接着思考：int... 类型的 a 到底是什么？怎么验证你的猜测？
        //System.out.println(a); // [I@********
        // 知道它是数组，就可以完成求和功能了
        int sum = 0;
        for(int num : a) {
            sum += num;
        }
        return sum;
    }

    // 继续思考：打开下面的注释，会报错吗？
    // 方法参数：int... vs int[]
    /*public static int add(int[] b) {
        return 0;
    }*/
}

package day240508.practice;

public class Practice1 {
    public static void main(String[] args) {
        //需求:如何计算出这个算法的运行时间
        int sum = 0;
        for (int i = 1; i <=100 ; i++) {
            sum +=i;
        }
        System.out.println(sum);
    }
}

package day240508.practice;

public class Practice1 {
    public static void main(String[] args) {
        //需求:如何计算出这个算法的运行时间
        //思路:
        //记录开始时间
        long start = System.currentTimeMillis();
        int sum = 0;
        for (int i = 1; i <=100 ; i++) {
            sum +=i;
        }
        System.out.println(sum);
        //记录结束时间
        long end = System.currentTimeMillis();
        //计算开始时间到结束时间的差值
        System.out.println(start - end);
    }
}

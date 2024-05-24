package day240508.CountTime;

public class MyUtil {
       public static void calculateTime(Algorithm algorithm){
           // 记录开始时间
           long start = System.currentTimeMillis();

           // 这里是不确定的
           // ...
           algorithm.justDoIt();

           // 记录结束时间
           long end = System.currentTimeMillis();
           // 计算结束时间和开始时间的差值
           System.out.println(end - start);
       }
}

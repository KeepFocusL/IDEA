package day240125;

public class If {
    public static void main(String[] args) {
        int x = 9 ;
        int y = 8 ;

        //你实现
        int max = (x >= y) ? x : y;
        if (x >= y)
            System.out.println(x);
        else
            System.out.println(y);
        //最终输出较大的那个数
        System.out.println("x,y中较大的数值="+ max);

    }
}

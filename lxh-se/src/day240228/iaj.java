package day240228;

public class iaj {
    public static void main(String[] args) {
        int[][] ia = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        for (int i = 0; i < ia.length; i++) {
            for (int j = 0; j < ia.length; j++) {
                System.out.print(ia[j][j]);
            }
        }
    }
}
/*i为外层循环 j为内层循环 打印j时，j运行内部循环,i作为循环数
因为打印的是j，所以要运行完j0,j1,j2，i才算第一次循环，总共要运行三次
打印出159
两个for之间的数互不干涉
比如fori=0,forj=0,输出结束，到下一个数fori=1,但此时forj还是从0开始一个一个运行而不是fori往前一个循环forj直接跳过0这个循环进入1，fori每循环一次往前进一位forj还是要从0开始循环
第一次循环 j0=1，j1=5,j2=9 输出为159
循环三次结果为159159159
*/

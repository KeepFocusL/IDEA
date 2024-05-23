package day240522.qa;

/**
 * 10. 如何给 xx 和 yy 赋值
 */
@SuppressWarnings({"all"})
public class E10 {
    public static void main(String[] args) {
        // 连续声明
        //int[] xx, yy[];

        // 非连续声明
        /*int[] xx;
        int[] yy[];*/

        // 数组的多种写法
        int[] xx;
        int[][] yy;

        // xx = 你的代码;
        //xx = new int[] {1,2};
        xx = new int[2];
        xx[0] = 1;
        xx[1] = 2;
        // yy = 你的代码;
        yy = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
    }
}
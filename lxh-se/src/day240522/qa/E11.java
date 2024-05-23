package day240522.qa;

/**
 * 11. 以下选项会报错的是？
 */
@SuppressWarnings({"all"})
public class E11 {
    public static void main(String[] args) {
        int[] xx, yy[];
        // 前提：
        // 假设已经给 xx 和 yy 赋值了

        // xx = 你的代码
        // yy = 你的代码

        // 参考 E10 《===

        // 问：
        // 在以下 A 到 F 的选项中，打开注释之后哪些不会报错？

        /*
        xx[0] = yy;        // A
        yy[0] = xx;        // B (✅)
        yy[0][0] = xx;     // C
        xx[0][0] = yy;     // D
        yy[0][0] = xx[0];  // E (✅)
        xx = yy;           // F
        */
    }
}
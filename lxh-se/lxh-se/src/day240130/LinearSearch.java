package day240130;

/**
 * 问题描述
 *   已知数组 int[] arr = new int[]{10, 50, 30, 70, 80, 60, 20, 90, 40};
 *   查找20是否在上述数组中出现过？如果出现，输出对应的索引值；否则输出没有找到
 *
 * 预期输出
 *   在index=**的位置上找到了**
 *   没有找到**
 *
 * keynote
 */
public class LinearSearch {
    public static void main(String[] args) {
        // 数据
        // 这些数据长什么样子？
        // 适合用什么变量类型（数据结构）来保存它
        int[] arr = new int[]{10, 50, 30, 70, 80, 60, 20, 90, 40};
        int target = 20;

        // 操作
        // 怎么操作
        // 要看数组里面的每一个元素是什么
        /*int i1 = arr[0];
        if (target == i1) {
            System.out.println("在index=" + 0 + "的位置上找到了" + target);
        }
        // 再找
        int i2 = arr[1];
        if (target == i2) {
            System.out.println("在index=" + 1 + "的位置上找到了" + target);
        }
        // 再找
        int i3 = arr[2];
        if (target == i3) {
            System.out.println("在index=" + 2 + "的位置上找到了" + target);
        }*/
        // ...

        // 优化你的过程
        // 怎么优化？
        /*for (int i = 0; i < arr.length - 1; i++) {
            if (target == arr[i]) {
                System.out.println("在index=" + i + "的位置上找到了" + target);
                //break;
            }
            System.out.println("-----");
            System.out.println("====");
            System.out.println("......");
        }*/

        LinearSearch.search(arr, target);


        /*boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                System.out.println("在index=" + i + "的位置上找到了" + target);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("没有找到" + target);
        }*/
    }

    public static void search(int[] arr, int target) {
        boolean notFound = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (target == arr[i]) {
                System.out.println("在index=" + i + "的位置上找到了" + target);
                notFound = false; // 改
                break;
            }
        }

        if (notFound) {
            System.out.println("没有找到" + target);
        }
    }
}
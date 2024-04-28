package day240129;

public class TwoDimensionalArrayElementDefaultValue {
    public static void main(String[] args) {
        // 5. 数组元素的默认初始化值
        // 5.1 对应动态初始化方式1
        int[][] arr1 = new int[3][2];
        // 外层元素默认值
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        // 内层元素默认值
        System.out.println(arr1[0][0]);

        boolean[][] arr2 = new boolean[3][4];
        // 外层元素默认值
        System.out.println(arr2[0]);
        // 内层元素默认值
        System.out.println(arr2[0][1]);

        String[][] arr3 = new String[4][2];
        // 外层元素默认值
        System.out.println(arr3[0]);
        // 内层元素默认值
        System.out.println(arr3[0][1]);

        // === === ===

        // 对应动态初始化方式2
        int[][] arr4 = new int[4][];
        // 外层元素默认值
        /*
        null
        未分配
         */
        System.out.println(arr4[0]);
        // 内层元素默认值
        /*
        报错
         */
        System.out.println(arr4[0][0]);

        // String类型呢

        /*
        Next: TwoDimensionalArrayInMemory
         */
    }
}
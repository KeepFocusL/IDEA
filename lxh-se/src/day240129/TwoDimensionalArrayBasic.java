package day240129;

/**
 * 二维数组
 *   一维数组中的元素也是数组
 * <p>
 * 类比
 *   各个月份的销售额
 *     一维数组即可 int[] m = new int[]{...}
 *   季度的销售额
 *     4个一维
 */
public class TwoDimensionalArrayBasic {
    public static void main(String[] args) {
        //1. 数组的声明与初始化
        //静态初始化:数组变量的赋值和数组元素的赋值同时进行
        int[][] arr2 = new int[][]{{3, 5, 8}, {12, 9}, {7, 0, 6, 4}};

        System.out.println(arr2[0]);
        System.out.println(arr2[0][2]);



        //动态初始化1:数组变量的赋值和数组元素的赋值分开进行
        String[][] arr3 = new String[3][4];

        //动态初始化2
        double[][] arr4 = new double[2][];

        //其它正确的写法：
        int arr5[][] = new int[][]{{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};
        int[] arr6[] = new int[][]{{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};
        int arr7[][] = {{1, 2, 3}, {4, 5}, {6, 7, 8, 9}}; //类型推断
        String arr8[][] = new String[3][4];


        //2. 数组元素的调用
        // arr2，外层元素{1,2,3}、{4,5}、{6,7,8,9} 内层元素：1,2,3,4,5,6,7,8,9
        // 访问内层元素
        System.out.println(arr2[0][0]);
        System.out.println(arr2[2][1]);

        // 访问外层元素
        System.out.println(arr2[0]);

        // arr3
        arr3[0][1] = "Tom";
        System.out.println(arr3[0][1]);
        System.out.println(arr3[0]);

        // arr4
        arr4[0] = new double[4];
        arr4[0][0] = 1.0;

        //3. 数组的长度
        System.out.println(arr2.length);
        System.out.println(arr2[0].length);
        System.out.println(arr2[1].length);
        System.out.println(arr2[2].length);

        //4. 如何遍历数组
        /*
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + "\t");
            }
            System.out.println();
        }
         */
        // arr[x][y]
    }
}
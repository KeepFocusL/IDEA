package practice.algorithm;

public class BinarySearch {
    public static void main(String[] args) {
        //初始数据
        int[] arr = new int[]{3, 4, 5, 6, 7, 8, 9};
        int target = 8;
        //数据+算法（顺序、分支、循环）=程序
        int low = 0;
        int high = arr.length - 1;
        boolean found = false;
        //while(true)
        while (low <= high) {
            int middle = (low + high) / 2;
            int currentValue = arr[middle];
            if (target == currentValue) {
                System.out.println("在index=" + middle + "的位置上找到了" + target);
                found = true; //改
                break;


            } else if (target > currentValue) {
                //target>currentValue
                low = middle + 1;

            } else {
                //target<currentValue
                high = middle - 1;

            }
        }
        if (!found) {
            System.out.println("没有找到" + target);
        }
    }
}

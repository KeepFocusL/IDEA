package day240512.p;

public class MySortUtil {
    public static void sort(int[] arr) {
        // 写具体的排序算法，可以回顾之前写过的 BubbleSort
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < (arr.length - 1) - i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}


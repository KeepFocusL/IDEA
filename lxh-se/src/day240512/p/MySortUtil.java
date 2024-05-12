package day240512.p;

public class MySortUtil {

    public static void sort(MyObjectUtil[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < (arr.length - 1) - i; j++) {
                if (arr[j].xxx > arr[j + 1].xxx) {
                    MyObjectUtil temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
    public static void print(MyObjectUtil[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}


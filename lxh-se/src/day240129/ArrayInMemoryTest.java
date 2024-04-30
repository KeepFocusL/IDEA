package day240129;

public class ArrayInMemoryTest {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 6;
        arr[1] = 7;
        arr[2] = 8;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        int[] arr1 = arr;
        arr1[1] = 9;
        System.out.println(arr[1]);
        System.out.println(arr1[1]);
        // sout arr and arr1
    }
}
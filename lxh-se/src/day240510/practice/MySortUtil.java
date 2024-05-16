package day240510.practice;

public class MySortUtil {
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "   ");
        }
        System.out.println();
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < (arr.length - 1); j++) {
                if (arr[j] > arr[j] + 1) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void print(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].age + "   ");
        }
        System.out.println();
    }

     public static void sort(Student[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < (arr.length - 1) - i; j++) {
                if (arr[j].age > arr[j+1].age) {
                    Student temp = arr[j];
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

    public static void print(Dog[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].weight + "   ");
        }
        System.out.println();
    }

    public static void sort(Dog[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < (arr.length - 1); j++) {
                if (arr[j].weight > arr[j].weight + 1) {
                    Dog temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void print(TV[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].price + "   ");
        }
        System.out.println();
    }

    public static void sort(TV[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < (arr.length - 1); j++) {
                if (arr[j].price > arr[j].price + 1) {
                    TV temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void print(Room[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].area + "   ");
        }
        System.out.println();
    }

    public static void sort(Room[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < (arr.length - 1); j++) {
                if (arr[j].area > arr[j].area + 1) {
                    Room temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
//    public static void print(实例化的类[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i].类中要排序的int数据 + "   ");
//        }
//        System.out.println();
//    }
//
//    public static void sort(实例化的类[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            boolean swapped = false;
//            for (int j = 0; j < (arr.length - 1); j++) {
//                if (arr[j].类中要排序的int数据 > arr[j].类中要排序的int数据 + 1) {
//                    实例化的类 temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//            if (!swapped) {
//                break;
//            }
//        }
//    }
}
package day240129;

public class PhoneNumberPractice {
    public static void main(String[] args) {
        String phoneNumber = "";
        int[] arr1 = new int[]{8, 5, 0, 7, 9, 2, 1};

        //访问数组
        int[] arr2 = new int[]{6, 0, 1, 2, 3, 4, 1, 5, 2, 2, 6};

        //循环
        for (int i = 0; i < arr2.length; i++) {
            int value = arr2[i];

            phoneNumber += arr1[value];
        }
        System.out.println("phoneNumber:" + phoneNumber);
    }
}

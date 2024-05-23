package practice.e0;

public class DisplayPhoneNumberTest11 {
    public static void main(String[] args) {
        int[] array1 = new int[]{8, 2, 1, 0, 3};
        int[] array2 = new int[]{2, 0, 3, 2, 4, 0, 1, 3, 2, 3, 3};
        String phoneNumber = "";
        for (int i = 0; i < array2.length; i++) {
            int value = array2[i];
            phoneNumber += array1[value];
        }
        System.out.println("phoneNumber：" + phoneNumber);
    }
}


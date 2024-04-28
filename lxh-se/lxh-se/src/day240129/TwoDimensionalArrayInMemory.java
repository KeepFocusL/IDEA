package day240129;

public class TwoDimensionalArrayInMemory {
    public static void main(String[] args) {
        String[][] arr1 = new String[3][2];
        int[][] arr2 = new int[4][];
        arr2[1] = new int[5];
        arr2[1][1] = 1;
        //arr2[2] = new int[3];

        arr2[2][2] = 1;
        //System.out.println(arr2[2][2]);
    }
}

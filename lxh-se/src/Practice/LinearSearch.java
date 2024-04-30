package Practice;

public class LinearSearch {
    public static void main(String[] args) {
        boolean notFound = true;
        int[] arr = new int[]{10, 50, 30, 70, 80, 60, 20, 90, 40};
        int target = 20;
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                System.out.println("在index=" + i + "的位置找到了" + target);
                notFound = false;
                break;
            }
        }
        if (notFound) {
            System.out.println("没有找到" + target);
        }
    }
}
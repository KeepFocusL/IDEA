package day240512.p;

/**
 * 以终为始
 */
public class Test {
    public static void main(String[] args) {
        // 需求：支持排序 int[]
        int[] intArr = new int[] {5, 3, 9, 2, 1};
        MySortUtil.sort(intArr);
        MySortUtil.print(intArr);

        // 新需求：支持排序 Student[]
        int size = 5;
        Student[] studentArr = new Student[size];
        for (int i = 0; i < size; i++) {
            studentArr[i] = new Student("编号-" + i, 23 - i);
        }
        MySortUtil.print(studentArr);
        MySortUtil.sort(studentArr);
        MySortUtil.print(studentArr);
    }
}
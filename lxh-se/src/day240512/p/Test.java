package day240512.p;

/**
 * 以终为始
 */
public class Test {
    public static void main(String[] args) {
        // 需求：支持排序 int[]
        int[] intArr = new int[]{5, 3, 9, 2, 1};
        // 新需求：支持排序 Student[]
        int size = 5;
        Student[] studentArr = new Student[size];
        for (int i = 0; i < size; i++) {
            studentArr[i] = new Student("编号-" + i, 23 - i);
        }
        MySortUtil.print(studentArr);
        MySortUtil.sort(studentArr);
        MySortUtil.print(studentArr);

        // 新需求：
        // 支持排序 Dog[]（按体重 weight）
        Dog[] dogArr = new Dog[size];
        for (int i = 0; i < size; i++) {
            dogArr[i] = new Dog("dog-" + i, 6.0 - i);
        }
        MySortUtil.print(dogArr);
        MySortUtil.sort(dogArr);
        MySortUtil.print(dogArr);
        // 支持排序 TV[]（按价格 price）
        // 支持排序 Room[]（按面积 area）
        // 以及任何其他类型...
        // 目标：让 MySortUtil 代码足够`稳定`，同时`可扩展`
    }
}
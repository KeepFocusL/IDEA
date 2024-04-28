package day240131;

public class StudentTest {
    public static void main(String[] args) {
        // new/create object 1 from Student class
        Student student1 = new Student("小芳", '女', "辫子粗又长", 18);

        // new/create object 2 from Student class
        Student student2 = new Student("小胖", '男', "短发", 20);

        // new/create object 3 from Student class
        Student student3 = new Student("老六", '男', "光头", 22);


        // 把他们装在一起
        // 之 - 静态初始化 Student 数组
        Student[] students = new Student[] {student1, student2, student3};

        // 之 - 动态初始化 Student 数组
        Student[] stds = new Student[3];
        stds[0] = student1;
        stds[1] = student2;
        stds[2] = student3;
    }
}
package day240130;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "小芳";
        student1.sex = '女';
        student1.age = 18;
        student1.hairstyle = "辫子粗又长";

        Student student2 = new Student();
        student2.name = "小胖";
        student2.sex = '男';
        student2.age = 20;
        student2.hairstyle = "短发";

        Student student3 = new Student();
        student3.name = "老六";
        student3.sex = '男';
        student3.age = 22;
        student3.hairstyle = "光头";

        Student[] arr = new Student[3];
        arr[0] = student1;
        arr[1] = student2;
        arr[2] = student3;
    }
}
package day240303.e1;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.age = 18;
        s1.id = 1001;
        s1.name = "小红";
        System.out.println("学生" + (s1.id) + "的信息:" + "年龄=" + s1.age + "、学号=" + s1.id + "、姓名=" + s1.name);

        Student s2 = new Student();
        s2.age = 20;
        s2.id = 1002;
        s2.name = "老黑";
        System.out.println("学生" + (s2.id) + "的信息:" + "年龄=" + s2.age + "、学号=" + s2.id + "、姓名=" + s2.name);
    }
}

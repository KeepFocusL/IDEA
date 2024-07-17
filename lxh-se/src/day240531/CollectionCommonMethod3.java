package day240531;
import java.util.ArrayList;

public class CollectionCommonMethod3 {
    public static void main(String[] args) {
        ArrayList<String> als = new ArrayList<>();
        als.add("abc");
        als.add("qwe");
        als.add("asd");
        System.out.println(als.contains("asd"));

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("X", 18));
        students.add(new Student("Y", 19));
        students.add(new Student("Z", 20));
        System.out.println(students.contains(new Student("Y", 19)));
        // 有哪些方式可以验证 contains 方法调用了 Student 类重写的 equals 方法
        // - sout
        // - debug
        // - 阅读 contains 方法的源码
    }
}

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        Student other = (Student)obj;
        return this.age == other.age && this.name.equals(other.name);
    }
}
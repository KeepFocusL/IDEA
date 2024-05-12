package day240512.p;

public class Student extends MyObjectUtil {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + "(" + this.age + ")";
    }

    public int compareTo(MyObjectUtil myObjectUtil) {
        Student student = (Student) myObjectUtil;
        if (this.age == student.age) {
            return 0;
        } else if (this.age > student.age) {
            return 1;
        } else {
            return -1;
        }
    }
}
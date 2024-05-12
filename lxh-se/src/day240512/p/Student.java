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

    @Override
    public boolean isLargerThan(MyObjectUtil myObjectUtil) {
        Student student = (Student) myObjectUtil;
        if (this.age > student.age) {
            return true;
        }
        return false;
    }
}
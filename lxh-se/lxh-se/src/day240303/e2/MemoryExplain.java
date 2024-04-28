package day240303.e2;

public class MemoryExplain {
    public static void main(String[] args) {
        Student student = new Student();
        student.id = "9876543";
        student.name = "小红";
        student.age = 18;

        // new 2 dogs
        Dog d1 = new Dog();
        d1.id = "d100";
        d1.name = "d-abc";
        d1.color = "black";

        Dog d2 = new Dog();
        d2.id = "d200";
        d2.name = "d-uuui";
        d2.color = "red";

        Dog[] ds = new Dog[]{d1, d2};

        student.dogs = ds;

        student.show();
    }
}
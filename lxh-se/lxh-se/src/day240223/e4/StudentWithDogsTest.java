package day240223.e4;

public class StudentWithDogsTest {
    public static void main(String[] args) {
        Dog dog1 = new Dog(1, "dog1", "yellow");
        Dog dog2 = new Dog(2, "dog2", "yellow");
        Dog dog3 = new Dog(3, "dog3", "yellow");

        StudentWithDogs student1 = new StudentWithDogs("1001", "STU-1", 18, new Dog[]{dog1});
        student1.show();

        StudentWithDogs student2 = new StudentWithDogs("1002", "STU-2", 19, new Dog[]{dog2, dog3});
        student2.show();
    }
}
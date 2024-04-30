package day240303.e2;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.id = "89757";
        student.name = "小高";
        student.age = 17;

        Dog[] dogs = new Dog[1];

        Dog dog1 = new Dog();
        dog1.id = "123";
        dog1.name = "D1";
        dog1.color = "黑";

        dogs[0] = dog1;

        student.dogs = dogs;

        student.show();

        // === === ===

        Student student2 = new Student();
        student2.id = "9876543";
        student2.name = "小红";
        student2.age = 18;

        // new 2 dogs
        //Dog[]
        Dog[] twoDogs = null;

        Dog dog2 = new Dog();
        dog2.id = "d200";
        dog2.name = "d-abc";
        dog2.color = "black";

        Dog dog3 = new Dog();
        dog3.id = "d300";
        dog3.name = "d-uuui";
        dog3.color = "red";

        twoDogs = new Dog[2];
        twoDogs[0] = dog2;
        twoDogs[1] = dog3;

        student2.dogs = twoDogs;

        student2.show();
    }
}
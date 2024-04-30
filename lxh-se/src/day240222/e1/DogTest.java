package day240222.e1;

public class DogTest {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        //dog1.id = 6;
        dog1.setId(6);
        dog1.name = "发财";
        dog1.color = "黄";
        dog1.show();
        //System.out.println(dog1.id);
        System.out.println(dog1.getId());

        System.out.println("=== === ===");

        Dog dog2 = new Dog();
        //dog2.id = 8;
        dog2.setId(8);
        dog2.name = "老狗";
        dog2.color = "黄";
        dog2.show();
    }
}
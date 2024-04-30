package day240324.oop;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("牢底");
        Cat cat = new Cat("梨花");
        person.adopt(cat);
        Dog dog = new Dog("小白");
        person.adopt(dog);
        Pig pig = new Pig("猪哥");
        person.adopt(pig);
        Rabbit rabbit = new Rabbit("笨蛋");
        person.adopt(rabbit);
    }
}

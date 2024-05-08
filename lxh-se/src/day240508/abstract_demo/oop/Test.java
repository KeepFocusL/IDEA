package day240508.abstract_demo.oop;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("牢底");
        Cat cat = new Cat();
        person.adopt(cat);
        Dog dog = new Dog();
        person.adopt(dog);

    }
}

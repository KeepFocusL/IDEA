package day240322.override_detail;

public class Person {
    //state
    String name;
    int age;

    //behavior
    public void eat() {
        System.out.println("eat=");
    }

    public void play() {
        System.out.println("play=");
    }
    public Animal returnAnimal(){
        return null;
    }
}

package day240322.override_detail;

public class Student extends Person {
    //state
    String School;

    //behavior
    @Override
    public void eat() {
        System.out.println("StudentEat=");

    }

    public void student() {
        System.out.println("student");
    }

    @Override // 或者是public Cat returnAnimal()  public Dog returnAnimal()
    public Animal returnAnimal() {
        return null;
    }
}

package day240508.abstract_demo.oop;

public abstract class Animal {
    String name;
    public Animal(String name) {
        this.name = name;
    }

    public abstract void info();
}

package day240510.practice;

public class Dog {
    //Dog[]（按体重 weight）
    int weight;

    public Dog(int weight) {
        this.weight = weight;
    }

    public Dog(String s, double v) {
    }

    @Override
    public String toString() {
        return "Dog{" +
                "weight=" + weight +
                '}';
    }
}

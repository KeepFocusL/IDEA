package day240512.p;

public class Dog extends MyObjectUtil {
    //Dog[]（按体重 weight）
    String name;
    double weight;

    public Dog(String name, double weight) {
        this.name = name;
        this.weight = weight;
        this.xxx = this.weight;
    }

    @Override
    public String toString() {
        return this.name + "(" + this.weight + ")";
    }
}

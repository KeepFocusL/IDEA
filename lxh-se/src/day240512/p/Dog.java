package day240512.p;

public class Dog extends MyComparable {
    //Dog[]（按体重 weight）
    String name;
    double weight;

    public Dog(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return this.name + "(" + this.weight + ")";
    }



    @Override
    public int compareTo(MyComparable myComparable) {
        return 0;
    }
}

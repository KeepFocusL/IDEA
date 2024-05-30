package day240515;

public class Dog {
    String name;
    double weight;

    public Dog(String name, double weight) {
        this.name = name;
        this.weight = weight;
        //this.xxx = this.weight;
    }

    @Override
    public String toString() {
        return this.name + "(" + this.weight + ")";
    }

    /*@Override
    public int compareTo(MyComparable o) {
        Dog d = (Dog) o;
        if (this.weight == d.weight) {
            return 0;
        } else if (this.weight > d.weight) {
            return 1;
        } else {
            return -1;
        }
    }*/
}

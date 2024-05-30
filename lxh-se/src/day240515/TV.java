package day240515;

public class TV {
    String name;
    double price;

    public TV(String name, double price) {
        this.name = name;
        this.price = price;
        //this.xxx = this.price;
    }

    @Override
    public String toString() {
        return this.name + "(" + this.price + ")";
    }

    /*@Override
    public int compareTo(MyComparable other) {
        TV o = (TV) other;
        if (this.price == o.price) {
            return 0;
        } else if (this.price > o.price) {
            return 1;
        } else {
            return -1;
        }
    }*/
}

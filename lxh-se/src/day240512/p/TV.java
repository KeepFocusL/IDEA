package day240512.p;

public class TV implements Comparable {
    //TV[]（按价格 price）
    double price;

    public TV(double price) {
        this.price = price;

    }

    @Override
    public String toString() {
        return "TV{" +
                "price=" + price +
                '}';
    }


    @Override
    public int compareTo(Comparable myComparable) {
        return 0;
    }
}

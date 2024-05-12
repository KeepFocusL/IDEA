package day240512.p;

public class TV extends MyObjectUtil {
    //TV[]（按价格 price）
    double price;

    public TV(double price) {
        this.price = price;
        this.xxx = this.price;
    }

    @Override
    public String toString() {
        return "TV{" +
                "price=" + price +
                '}';
    }
}

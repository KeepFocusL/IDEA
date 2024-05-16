package day240510.practice;

public class TV {
    //TV[]（按价格 price）
    int price;

    public TV(int price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "TV{" +
                "price=" + price +
                '}';
    }
}

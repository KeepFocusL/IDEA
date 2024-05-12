package day240512.p;

public class TV extends MyObjectUtil{
    //TV[]（按价格 price）
    int price;

    public TV(int price) {
        this.price = price;
        this.xxx=this.price;
    }

    @Override
    public String toString() {
        return "TV{" +
                "price=" + price +
                '}';
    }
}

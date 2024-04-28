package day240131;

public class PhoneTest {
    public static void main(String[] args) {
        //用phone的blueprint/prototype来创建instance/object
    Phone huawei = new Phone("华为","华为2024最新款");
    Phone xiaomi = new Phone("小米","小米2024最新款");

      //通过[对象名.]的方式来访问state或behavior
        System.out.println(huawei.name);
        huawei.call("18012314567");
        huawei.msg("12345678901","约吗");

        System.out.println("=== === ===");

        System.out.println(xiaomi.name);
        xiaomi.call("132567074321");
        xiaomi.msg("12357897354","玩游戏吗");

    }
}

package Practice.Mydog;

public class DogTest {
    public static void main(String[] args) {
        Dog wangcai = new Dog(1, "旺财", "黄色");
        Dog xiaobai = new Dog(2, "小白", "白色");
        System.out.println(wangcai.name);
        wangcai.Show("正在大叫");

        System.out.println("=========");

        System.out.println(xiaobai.name);
        xiaobai.Show("正在奔跑");
    }
}
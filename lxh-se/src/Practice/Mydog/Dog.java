package Practice.Mydog;

public class Dog {
    //state
    int id;
    String name;
    String color;

    public Dog(int id, String name, String color) {
        this.id = id;
        this.name = name;
        this.color = color;
    }

    //behavior
    void Show(String behavior) {
        System.out.println("狗（"+this.id+"）编号的信息:"+"编号：" + this.id + ",名称：" + this.name + ",颜色：" + this.color + ",行为：" + behavior);
    }
}


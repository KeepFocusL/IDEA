package day240324.e;

public abstract class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    // 我想要的效果是下面这个样子
    public abstract void describeLonely(String text);
    // 加了 final 关键字，代表子类不能再来重写我了
    public final void judgeXDD(String text) {
        System.out.println("XDD 你牛逼！");
    }
}

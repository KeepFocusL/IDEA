package day240801.thread_base;

public class Student {
    //不想在外面被new,怎么new

    private static Student instance;

    //private static Student instance = new Student();
    //在state中 new 只要外部加载了Student类就会自动new出来,因为他是静态方法,会伴随着加载类而加载静态的方法、属性。

    //在内部new,把构造方法隐藏起来
    private Student() {
        System.out.println("----");
    }

    //这里加了一把锁(synchronized),让多线程也能`单例`
    public synchronized static Student getInstance() {
        if (instance == null) {
            instance = new Student();
        }
        return instance;
    }
}
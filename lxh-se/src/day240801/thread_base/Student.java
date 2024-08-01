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

    //在behavior中 new,让外部想要new出这个类只能调用这个方法,但是这只是面向与单线程的单例,多线程的单例看后续commit
    public static Student getInstance() {
        if (instance == null) {
            instance = new Student();
        }
        return instance;
    }
}
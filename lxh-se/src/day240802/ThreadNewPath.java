package day240802;

/**
 * 如何启动一个条新的执行路径？
 * <p>
 * 方式一：extends Thread && Override run() && start()
 * 方式二：implements Runnable && implement run() && new Thread(...).start()
 * 方法其他：还有其他方式，本例子暂时先介绍这两种，后续再补充
 * <p>
 * 思考：`extends Thread` VS `implements Runnable` 哪种更合适？
 * - 考虑到未来的扩展性，最好选择 `implements Runnable`
 * - 因为 Java 的类只支持单继承，继承了 Thread 之后，以后就没办法再继承其他类
 */
public class ThreadNewPath {
    public static void main(String[] args) {
        Thread myThread1 = new MyThread1("Thread-path1");
        //myThread1.run();
        // 调用 start 方法，才是启动一条新的执行路径
        myThread1.start();

        /*Thread myThread2 = new Thread(new MyThread2(), "Thread-path2");
        myThread2.start();*/
        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + "---" + i);
            }

        }).start();
    }
}

class MyThread1 extends Thread {
    public MyThread1() {
    }

    public MyThread1(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(this.getName() + "---" + i);
        }
    }
}

class MyThread2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "---" + i);
        }
    }
}

package day240802;

/**
 * 如何启动一个条新的执行路径？
 * <p>
 * 方式一：extends Thread && Override run() && start()
 * 方式二：implements Runnable && implement run() && new Thread(...).start()
 * 方法其他：还有其他方式，本例子暂时先介绍这两种，后续再补充
 */
public class ThreadNewPath {
    public static void main(String[] args) {
        Thread myThread1 = new MyThread1("Thread-path1");
        //myThread1.run();
        // 调用 start 方法，才是启动一条新的执行路径
        myThread1.start();

        Thread myThread2 = new Thread(new MyThread2(), "Thread-path2");
        myThread2.start();
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

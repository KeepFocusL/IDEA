package day240802;

public class ThreadSynchronizedDemo {
    public static void main(String[] args) {
        // 见昨天的代码 #d1f0eae2 `多线程 + 单例 - synchronized 线程安全`
        ThreadSynchronizedDemo.classM1();
        new ThreadSynchronizedDemo().instanceM1();
    }

    public synchronized static void classM1() {
        System.out.println("ThreadSynchronizedDemo.classM1");
    }

    public synchronized void instanceM1() {
        System.out.println("ThreadSynchronizedDemo.instanceM1");
    }
}
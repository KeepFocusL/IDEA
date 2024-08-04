package day240802;

/**
 * 多运行几次当前程序，然后观察运行结果。
 * <p>
 * 思考：为什么？
 */
public class ThreadState {
    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "-1");
        }).start();

        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "-2");
        }).start();

        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "-3");
        }).start();
    }
}

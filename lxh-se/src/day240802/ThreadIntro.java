package day240802;

public class ThreadIntro {
    /**
     * Thread introduction
     * <p>
     * A thread in Java is the path followed when executing a program.
     * All Java programs have at least one thread, known as the main thread,
     * which is created by the Java Virtual Machine (JVM) at the program’s start, when the main() method is invoked.
     * <p>
     * The Java virtual machine allows an application to have multiple threads of execution running concurrently.
     * <p>
     * 线程：程序的执行路径
     * 多线程：程序中有多条执行路径
     * <p>
     * 学习多线程之前，就已经接触过线程了，main 就是一条执行路径，也就是一个线程、主线程、主执行路径
     * <p>
     * 在 Java 中，Thread 就是对线程的建模
     */
    public static void main(String[] args) {
        System.out.println("1");
        System.out.println("当前线程的名称=" + Thread.currentThread().getName());
        System.out.println("2");
        Thread.currentThread().setName("path-1");
        System.out.println("3");
        System.out.println("当前线程的名称=" + Thread.currentThread().getName());
    }
}

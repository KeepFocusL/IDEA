package day240802;

public class ThreadCommonMethod {
    public static void main(String[] args) throws InterruptedException {
        sleep();
    }

    private static void sleep() throws InterruptedException {
        System.out.println("1");
        Thread.sleep(1000);
        System.out.println("2");
    }
}
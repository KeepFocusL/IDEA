package day240802;

public class ThreadCommonMethod {
    public static void main(String[] args) throws InterruptedException {
        //sleep();
        //join();
        testYield();
    }


    private static void sleep() throws InterruptedException {
        System.out.println("1");
        Thread.sleep(1000);
        System.out.println("2");
    }

    private static void join() {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "---" + i);
            }
        });
        t1.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "---" + i);
        }
    }

    private static void testYield() {
        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + "---" + i);
                if (i % 10 == 0) {
                    Thread.yield();
                }
            }
        }).start();

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "---" + i);
        }
    }
}


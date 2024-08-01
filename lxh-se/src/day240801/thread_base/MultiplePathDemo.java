package day240801.thread_base;

public class MultiplePathDemo {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("path-new-Thread===" + i);
                }
            }
        }).start();

        for (int i = 0; i < 20; i++) {
            System.out.println("path-main===" + i);
        }
    }
}

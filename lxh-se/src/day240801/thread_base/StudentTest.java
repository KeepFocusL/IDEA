package day240801.thread_base;

public class StudentTest {
    public static void main(String[] args) {
        /*for (int i = 0; i < 5; i++) {
            System.out.println(Student.getInstance());
        }*/

        for (int i = 0; i < 5; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Student.getInstance());
                }
            }).start();  //.start()开启多条线程
        }
    }
}

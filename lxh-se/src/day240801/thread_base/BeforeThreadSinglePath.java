package day240801.thread_base;

public class BeforeThreadSinglePath {
    public static void d1() {
        d2();
        System.out.println("d1");
    }

    public static void d2() {
        d3();
        System.out.println("d2");
    }

    public static void d3() {
        System.out.println("d3");
    }

    public static void main(String[] args) {
        d1();
        System.out.println("main");
    }
}

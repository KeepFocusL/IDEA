package day240524.wrapper_class;

public class Q {
    public static void main(String[] args) {
        q1();
        q2();
        q3();
    }

    static void q1() {
        Integer i1 = new Integer(1);
        Integer i2 = new Integer(1);
        System.out.println(i1 == i2);
    }

    static void q2() {
        Integer i1 = 1;
        Integer i2 = 1;
        System.out.println(i1 == i2);
    }

    static void q3() {
        Integer i1 = 222;
        Integer i2 = 222;
        System.out.println(i1 == i2);
    }

}

package day240126;

public class LogicalPractice {   public static void main(String[] args) {
    //test1();
    test2();
    //test3();
    //test4();
}

    public static void test1() {
        int x = 1;
        int y = 1;
        if (x++ == 2 & ++y == 2) {
            x = 7;
        }
        /*
        x=2,y=2
        */
        System.out.println("x=" + x + ",y=" + y);
    }

    public static void test2() {
        int x = 1, y = 1;
        if (x++ == 2 && ++y == 2) {
            x = 7;
        }
        /*
        x=2,y=1
         */
        System.out.println("x=" + x + ",y=" + y);
    }

    public static void test3() {
        int x = 1, y = 1;
        if (x++ == 1 | ++y == 1) {
            x = 7;
        }
        /*
        x=7,y=2
         */
        System.out.println("x=" + x + ",y=" + y);
    }

    public static void test4() {
        int x = 1, y = 1;
        if (x++ == 1 || ++y == 1) {
            x = 7;
        }
        /*
        x=7,y=1
         */
        System.out.println("x=" + x + ",y=" + y);
    }
}


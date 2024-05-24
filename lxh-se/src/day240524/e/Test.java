package day240524.e;

public class Test {
    static int count = 100000;

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String result = "";
        for (int i = 0; i < count; i++) {
            result += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);

        System.out.println("=== === ===");

        long start1 = System.currentTimeMillis();
        String result1 = "";


        StringBuffer sb1 = new StringBuffer();
        for (int i = 0; i < count; i++) {
            sb1.append(i + result1);
        }

        long end1 = System.currentTimeMillis();
        System.out.println(end1 - start1);

        System.out.println("=== === ===");

        long start2 = System.currentTimeMillis();
        String result2 = "";

        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb2.append(i + result2);
        }
        long end2 = System.currentTimeMillis();
        System.out.println(end2 - start2);
    }

}

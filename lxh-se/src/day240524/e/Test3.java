package day240524.e;

public class Test3 {
    static int count = 10; // 10, 1000, 10000, 100000

    public static void main(String[] args) {
        // 字符串拼接
        // String `+`
        String s1 = "abc";
        String s2 = "xyz";
        System.out.println(s1 + s2);

        long s = System.currentTimeMillis();
        String result = "";
        for (int i = 0; i < count; i++) {
            result += i;
        }
        long e = System.currentTimeMillis();
        System.out.println(e - s);

        // StringBuffer append 方法
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("abc").append("xyz");
        System.out.println(stringBuffer);

        s = System.currentTimeMillis();
        StringBuffer sb1 = new StringBuffer();
        for (int i = 0; i < count; i++) {
            sb1.append(i);
        }
        e = System.currentTimeMillis();
        System.out.println(e - s);

        // StringBuilder append 方法
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("abc").append("xyz");
        System.out.println(stringBuilder);

        s = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb2.append(i);
        }
        e = System.currentTimeMillis();
        System.out.println(e - s);
    }
}
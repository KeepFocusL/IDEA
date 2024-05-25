package day240525;

public class Test {
    public static void main(String[] args) {
        Object o = 1;

        Integer i = 1; //Autoboxing: Integer i = new Integer(1) / Integer.valueOf(1);
        o = i; //父类引用指向子类对象，也类似与之前写过的代码:Person p = new Student();

        String s = "abc"; // new String("abc")
        // String 是引用数据类型，只要是引用数据类型，本质上都需要 new 操作，在堆空间中分配空间
        // 除非 xxx 做了特殊处理
    }
}

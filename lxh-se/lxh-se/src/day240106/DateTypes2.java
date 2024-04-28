package day240106;

public class DateTypes2 {
    public static void main(String[] args) {
       double double1 = 19.9;
/*
强制类型转换
 */
       int int1 = (int)double1;
       System.out.println(int1);

       long long1 = 121;
       short short2 = (short) long1;
       System.out.println((short2));

       int int2 = 128;
       byte byte1 = (byte) int2;
       System.out.println(byte1);
    }
}

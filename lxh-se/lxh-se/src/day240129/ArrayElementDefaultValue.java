package day240129;

public class ArrayElementDefaultValue {
    public static void main(String[] args) {
        // 5. 数组元素的默认初始化值
        /*
        整型 byte short int long
        浮点 float double
        字符 char
        布尔 boolean
        引用 String ...
         */
        String[] ages = new String[3];
        System.out.println(ages[0]);



        //int[] ages = new int[]{1, 5, 9};
        //System.out.println(ages[0]);

        // ...

        double[] doubles = new double[2];

        char[] chars = new char[2];
        /*
        chars[0]
        (int)chars[0]
        chars[0] == 0
        chars[0] == '0'
        chars[0] == '\u0000'
         */

        String[] strings = new String[2];
    }
}
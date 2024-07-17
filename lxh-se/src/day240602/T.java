package day240602;

public class T {
    public static void main(String[] args) {
        String code ="12ER8";
        String code1 ="12er8";
        System.out.println(code.equals(code1));

        //忽略大小写
        System.out.println(code.equalsIgnoreCase(code1));

        //转成小写
        System.out.println(code.toLowerCase());

        //转成大写
        System.out.println(code1.toUpperCase());
    }
}

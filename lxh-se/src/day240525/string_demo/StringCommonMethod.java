package day240525.string_demo;

@SuppressWarnings({"all"})
public class StringCommonMethod {
    public static void main(String[] args) {
        String code = "abcxyz";
        String codeUpperCase = code.toUpperCase(); // ABCXYZ 转换大写
        System.out.println(codeUpperCase);
        System.out.println(code.equals(codeUpperCase));
        System.out.println(code.equalsIgnoreCase(codeUpperCase));

        System.out.println(code.endsWith("z")); //最后一个字符是不是你输入的字符
        System.out.println(code.startsWith("a")); //第一个一个字符是不是你输入的字符
    }
}

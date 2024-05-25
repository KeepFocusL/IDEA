package day240525.string_interview;

public class StringTest {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        String sq = new String("xyz");
        String sz = new String("xyz");
        System.out.println(sq == sz);
        System.out.println(sq.equals(sz));

        String sa = "xyz"; //"xyz"=字面量 , sa =变量
        String sb = "xyz";
        System.out.println(sa == sb);
    }
}

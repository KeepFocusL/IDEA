package day240730.enum_demo2;

public class CustomTypeTest {
    public static void main(String[] args) {
        System.out.println(CustomType.JAVA);
        System.out.println(CustomType.PYTHON);

        CustomType[] values = CustomType.values();
        for (CustomType value : values) {
            System.out.println(value);
        }

        System.out.println("=== === ===");

        System.out.println(CustomType.valueOf("JAVA"));

        // java.lang.IllegalArgumentException: No enum constant ...CustomType...
        System.out.println(CustomType.valueOf("java"));
    }
}
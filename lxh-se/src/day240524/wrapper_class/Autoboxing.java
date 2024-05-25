package day240524.wrapper_class;

public class Autoboxing {
    public static void main(String[] args) {
        // Passed as a parameter to a method that expects an object of the corresponding wrapper class.
        needByte((byte)1);
        short s = 1;
        needShort(s);
        needInteger(1);
        needLong(1L);
        needFloat(1.0F);
        double d = 1.0;
        needDouble(d);
        needBoolean(true);
        char c = '好';
        needCharacter(c);

        // Assigned to a variable of the corresponding wrapper class.
        byte b = 1;
        Byte bt = b;
        // 其他大家动手补充
    }

    static void needByte(Byte ref){}
    static void needShort(Short ref){}
    static void needInteger(Integer ref){}
    static void needLong(Long ref){}
    static void needFloat(Float ref){}
    static void needDouble(Double ref){}
    static void needBoolean(Boolean ref){}
    static void needCharacter(Character ref){}
}
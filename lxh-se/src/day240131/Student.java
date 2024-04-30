package day240131;

public class Student {
    // 1. state
    // 1.1 Class Variables (Static Fields)
    static String country = "中国";
    // 1.2 Instance Variables (Non-Static Fields)
    String name;
    char sex;
    String hairstyle;
    int age;

    // 自动生成构造方法 Constructor
    // 右击 -> Generate -> Constructor -> 选择所有 'state' -> 点击 OK
    public Student(String name, char sex, String hairstyle, int age) {
        this.name = name;
        this.sex = sex;
        this.hairstyle = hairstyle;
        this.age = age;
    }
}

// 2. behavior
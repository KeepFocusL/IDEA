package day240125;

public class Loop {
    public static void main(String[] args) {
    //System.out.println("Hello World!");

    // 新需求：5x
    // 重复的事情，人类不擅长，但是计算机非常擅长

    // i= 0, 1, 2, 3, 4
    for (int i = 0; i < 5; i++) {
        System.out.println("Hello World!");
    }

    System.out.println("=== === ===");

    int count = 5;
    while (count > 0) {
        System.out.println("Hello World!");
        count--;
    }

    System.out.println("=== === ===");

    int count2 = 5;
    do {
        System.out.println("Hello World!");
        count2--;
    } while (count2 > 0);
}
}

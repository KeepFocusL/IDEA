package day240111;

public class While
{
    public static void main(String[] args) {
        // 遍历1-100以内的所有偶数
        int i = 1;
        while (i<= 100){
            if (i % 2 == 0){
                System.out.println(i);
            }
            i++; //i= i + 1;
        }
        System.out.println("=== === ===");

        System.out.println("i=" + i);
    }
}


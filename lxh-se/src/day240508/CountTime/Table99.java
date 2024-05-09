package day240508.CountTime;

public class Table99 extends Time{
    public void count() {
        for (int i = 1; i <= 9; i++) { // 行
            for (int j = 1; j <= i ; j++) { // 列
                System.out.print(i + " * " + j + " = " + (i * j) + "  ");
            }
            System.out.println();
        }
    }
}

package day240303.e3;

public class Student {
    //state
    int number;
    int state;
    int score;

    //behavior
    public void show() {
        System.out.println("学生学号=" + number + "、年级=" + state + "、成绩=" + score);
    }

    public int add(int a, int b) {
        return a + b;
    }

}
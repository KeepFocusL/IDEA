package day240308;

public class Student {
    //state
    String number;

    private static final Student instance = new Student();

    private Student() {
        System.out.println("----");

    }

    //behavior
    public static Student getInstance() {
        return instance;
    }
}



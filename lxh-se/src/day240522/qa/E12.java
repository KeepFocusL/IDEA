package day240522.qa;

/**
 * 12. 如何确保以下的 Student 类，有且仅有一个实例
 */
@SuppressWarnings({"all"})
public class E12 {
    public static void main(String[] args) {
        // 从提交记录中搜索 `singleton`

        //Student student = new Student();
        /*System.out.println(Student.INSTANCE);
        System.out.println(Student.INSTANCE);
        System.out.println(Student.INSTANCE);*/
    }
}

class Student {
    // 1. state (field, variable)
    final static Student INSTANCE = new Student();

    // 3. constructor
    private Student() {

    }

    // 2. behavior (method, function)
}
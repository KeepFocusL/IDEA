package day240303.e3;

public class StudentTest {
    public static void main(String[] args) {

        Student[] students = new Student[20];

        for (int i = 0; i < 20; i++) {
            Student student = new Student();
            student.number = i + 1;
            student.state = (int) (Math.random() * 6 + 1);
            student.score = (int) (Math.random() * 101);
            students[i] = student;
        }
        for (int i = 0; i < students.length; i++) {
            if (students[i].state == 2) {
                students[i].show();
            }
        }
        System.out.println("==== ==== ====");

        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1; j++) {
                if (students[j].score < students[j + 1].score) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < students.length; i++) {
            students[i].show();
        }


    }
}
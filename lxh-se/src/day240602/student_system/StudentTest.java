package day240602.student_system;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class StudentTest {
    private static final Scanner scanner = new Scanner(System.in);

    private static List<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("--- --- --- --- --- ---");
            System.out.println("请输入操作编号：");
            System.out.println("1. 添加学生");
            System.out.println("2. 删除学生");
            System.out.println("3. 修改学生信息");
            System.out.println("4. 查询特定学生信息");
            System.out.println("5. 查看所有学生信息");
            System.out.println("6. 退出");
            System.out.println("--- --- --- --- --- ---");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    deleteStudent();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    queryStudent();
                    break;
                case 5:
                    listStudents();
                    break;
                case 6:
                    System.out.println("已退出学生管理系统。");
                    /*System.exit(0);
                    break;*/
                    return;
                default:
                    System.out.println("无效的操作编号！");
            }
        }
    }

    private static void addStudent() {
        System.out.println("请输入学生姓名：");
        String name = scanner.next();

        System.out.println("请输入学生年龄：");
        int age = scanner.nextInt();

        System.out.println("请输入学生家乡：");
        String gender = scanner.next();

        Student student = new Student(name, age, gender);
        students.add(student);

        System.out.println("添加学生成功！");
    }

    private static void deleteStudent() {
        System.out.println("请输入要删除的学生姓名：");
        String name = scanner.next();

        Student student = findStudentByName(name);
        if (student == null) {
            System.out.println("学生不存在！");
            return;
        }

        students.remove(student);

        System.out.println("删除学生成功！");
    }

    private static void updateStudent() {
        System.out.println("请输入要修改的学生姓名：");
        String name = scanner.next();

        Student student = findStudentByName(name);
        if (student == null) {
            System.out.println("学生不存在！");
            return;
        }

        System.out.println("请输入学生新姓名：");
        String newName = scanner.next();

        System.out.println("请输入学生新年龄：");
        int newAge = scanner.nextInt();

        System.out.println("请输入学生新家乡：");
        String newHometown = scanner.next();

        student.setName(newName);
        student.setAge(newAge);
        student.setHometown(newHometown);

        System.out.println("修改学生成功！");
    }

    private static void queryStudent() {
        System.out.println("请输入要查询的学生姓名：");
        String name = scanner.next();

        Student student = findStudentByName(name);
        if (student == null) {
            System.out.println("学生不存在！");
            return;
        }

        System.out.println(student);
    }

    private static Student findStudentByName(String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }

        return null;
    }

    public static void listStudents() {
        if (students.isEmpty()) {
            System.out.println("当前没有任何学生信息。");
        } else {
            System.out.println("所有学生信息如下:");
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }
}

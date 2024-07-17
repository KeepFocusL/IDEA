package practice.student_system;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentTest {
    private static final Scanner scanner = new Scanner(System.in);

    private static List<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("欢迎使用学生管理系统");
        while (true) {
            System.out.println("--- --- --- --- ---");
            System.out.println("请输入操作编号");
            System.out.println("1.列出所有学生信息");
            System.out.println("2.增加学生");
            System.out.println("3.删除指定学生");
            System.out.println("4.更改指定学生信息");
            System.out.println("5.查找指定学生信息");
            System.out.println("6.退出系统");
            System.out.println("--- --- --- --- ---");
            int i = scanner.nextInt();
            switch (i) {
                case 1:
                    listStudents();
                    break;
                case 2:
                    addStudents();
                    break;
                case 3:
                    deleteStudents();
                    break;
                case 4:
                    changeStudents();
                    break;
                case 5:
                    queryStudents();
                    break;
                case 6:
                    System.out.println("成功退出系统");
                    return;
            }
        }
    }

    private static void listStudents() {
        if (students.isEmpty()) {
            System.out.println("当前没有学生信息");
        } else {
            System.out.println("学生的信息如下");
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }

    private static void addStudents() {
        System.out.println("请输入姓名");
        String name = scanner.next();

        System.out.println("请输入年龄");
        int age = scanner.nextInt();


        System.out.println("请输入家乡");
        String hometown = scanner.next();

        Student student = new Student(name, age, hometown);
        students.add(student);
        System.out.println("学生添加成功");
    }

    private static void deleteStudents() {
        System.out.println("请输入你要删除的学生信息");
        String name = scanner.next();
        Student student = findStudentsByName(name);

        if (student == null) {
            System.out.println("当前没有学生信息");
        }

        students.remove(student);
        System.out.println("学生删除成功");
    }

    private static void changeStudents() {
        System.out.println("请输入你要修改的学生信息");
        String name = scanner.next();
        Student student = findStudentsByName(name);
        if (student == null) {
            System.out.println("未查到学生信息");
        } else {
            System.out.println("请输入新的学生姓名");
            String newName = scanner.next();

            System.out.println("请输入新的学生年龄");
            int newAge = scanner.nextInt();

            System.out.println("请输入新的学生家乡");
            String newHometown = scanner.next();

            student.setName(newName);
            student.setAge(newAge);
            student.setHometown(newHometown);
        }
    }

    private static void queryStudents() {
        System.out.println("请输入要查询的学生");
        String name = scanner.next();

        Student studentsByName = findStudentsByName(name);
        if (studentsByName == null) {
            System.out.println("学生不存在");
            return;
        }
        System.out.println(studentsByName);
    }

    private static Student findStudentsByName(String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }
}

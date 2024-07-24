package student_system;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class StudentManagementSystem {
    private static final Scanner scanner = new Scanner(System.in);

    private static final List<Student> students = new ArrayList<>();

    private static final Properties STUDENTS_PROPERTIES = new Properties();
    private static final String FILE_NAME = "src/student_system/students.properties";

    public static void main(String[] args) throws IOException {
        loadFromFile();

        while (true) {
            System.out.println("--- --- --- --- ---");
            System.out.println("1.增加学生信息");
            System.out.println("2.删除学生信息");
            System.out.println("3.修改学生信息");
            System.out.println("4.查找指定学生信息");
            System.out.println("5.查找所有学生信息");
            System.out.println("6.退出");
            System.out.println("--- --- --- --- ---");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    deleteStudent();
                    break;
                case 3:
                    changeStudent();
                    break;
                case 4:
                    queryStudent();
                    break;
                case 5:
                    linkStudent();
                    break;
                case 6:
                    storeToFile();
                    System.out.println("成功退出系统！");
                    System.exit(0);
                    break;
                default:
                    System.out.println("无效的操作编码！");
                    break;
            }
        }
    }
    //下载数据
    private static void loadFromFile() throws IOException {
        STUDENTS_PROPERTIES.load(new FileInputStream(FILE_NAME));
        Set<Object> objects = STUDENTS_PROPERTIES.keySet();
        for (Object next : objects) {
            String name = (String) next;
            String studentString = STUDENTS_PROPERTIES.getProperty(name);
            String[] split = studentString.split(",");
            students.add(new Student(split[0], Integer.parseInt(split[1]), split[2]));
        }
    }

    //上传数据
    private static void storeToFile() throws IOException {
        STUDENTS_PROPERTIES.clear();
        for (Student student : students) {
            String key = student.getName();
            String value = student.getName() + "," + student.getAge() + "," + student.getHometown();
            STUDENTS_PROPERTIES.setProperty(key, value);
        }
        STUDENTS_PROPERTIES.store(new FileOutputStream(FILE_NAME), STUDENTS_PROPERTIES.toString());
    }

    //增加学生信息
    private static void addStudent() {
        System.out.println("请输入学生姓名");
        String name = scanner.next();

        System.out.println("请输入学生年龄");
        int age = scanner.nextInt();

        System.out.println("请输入学生家乡");
        String hometown = scanner.next();

        Student student = new Student(name, age, hometown);
        students.add(student);
        System.out.println("学生添加成功！");
    }

    //删除学生信息
    private static void deleteStudent() {
        System.out.println("请输入你要删除的学生");
        String name = scanner.next();

        Student student = findStudentByName(name);
        if (student == null) {
            System.out.println("你输入的名字不存在!");
            return;
        }
        students.remove(student);

        System.out.println("删除信息成功！");
    }


    //更改学生信息
    private static void changeStudent() {
        System.out.println("请输入你要修改的学生姓名");
        String name = scanner.next();

        Student student = findStudentByName(name);
        if (student == null) {
            System.out.println("你输入的名字不存在");
        }

        System.out.println("请输入新的年龄：");
        int newAge = scanner.nextInt();

        System.out.println("请输入新的家乡：");
        String newHometown = scanner.next();

        student.setName(name);
        student.setAge(newAge);
        student.setHometown(newHometown);

        System.out.println("更改信息成功！");
    }

    //查找指定学生信息
    private static void queryStudent() {
        System.out.println("请输入你要查找的学生姓名");
        String name = scanner.next();

        Student student = findStudentByName(name);

        if (student == null) {
            System.out.println("学生不存在！");
            return;
        }

        System.out.println(student);
    }

    //查找所有学生信息
    private static void linkStudent() {
        if (students == null) {
            System.out.println("当前没有任何学生信息！");
        } else {
            System.out.println("当前学生信息如下：");
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    //在数据里找有没有这个学生的信息
    private static Student findStudentByName(String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }
}
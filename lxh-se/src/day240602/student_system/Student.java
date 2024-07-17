package day240602.student_system;

public class Student {
    private String name;
    private int age;
    private String hometown;

    public Student(String name, int age, String hometown) {
        this.name = name;
        this.age = age;
        this.hometown = hometown;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }


    @Override
    public String toString() {
        return "姓名=" + this.name + '\'' +
                ", 年龄=" + this.age +
                ", 家乡='" + this.hometown + '\'' +
                '}';
    }
}

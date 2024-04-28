package day240223.e3;
    /**
     * 面向对象思维练习 3
     * <p>
     * 写一个学生Student类
     *   - 3个state：学号id、姓名name、年龄age
     *   - 1个behavior：show方法（调用show方法之后的输出要求见预期输出）
     * 写一个学生测试类。实例化(new)出两个学生，为其state赋值，同时输出两个学生信息
     * <p>
     * 预期输出
     *   学生(学号**)的信息：学号=**、姓名=**、年龄=**
     */
    public class Student {
        // state
        String id;
        String name;
        int age;

        public Student(String id, String name, int age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }

        // behavior
        public void show() {
            System.out.println("学生(" + id + ")的信息：学号=" + id + "、姓名=" + name + "、年龄=" + age);
        }
    }
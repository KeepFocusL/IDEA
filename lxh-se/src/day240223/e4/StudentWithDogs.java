package day240223.e4;

import java.util.Arrays;

/**
 * 面向对象思维练习 4
 * <p>
 * 写一个学生StudentWithDogs类
 *   - 4个state：学号id、姓名name、年龄age、狗狗们dogs
 *   - 1个behavior：show方法（调用show方法之后的输出要求见预期输出）
 * 写一个测试类。实例化(new)出两个学生，为其state赋值，同时输出两个学生信息
 *   - 第一个学生有一只狗
 *   - 第二个学生有两只狗
 * <p>
 * 预期输出
 *   学生(学号**)的信息：学号=**、姓名=**、年龄=**、狗狗们=***
 */
public class StudentWithDogs {
    // state
    String id;
    String name;
    int age;
    Dog[] dogs;

    public StudentWithDogs(String id, String name, int age, Dog[] dogs) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dogs = dogs;
    }

    // behavior
    public void show() {
        System.out.println("学生(" + id + ")的信息：学号=" + id + "、姓名=" + name + "、年龄=" + age + "、狗狗们=" + Arrays.toString(dogs));
    }
}

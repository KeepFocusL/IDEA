package day240303.e2;

/**
 * 写一个学生Student类（with dogs）
 * - 4个state：学号id、姓名name、年龄age、狗狗们dogs
 * - 1个或多个behavior：至少有一个show方法（调用show方法之后的输出要求见预期输出）
 * 写一个测试类。实例化(new)出两个学生，为其state赋值，同时输出两个学生信息
 * - 第一个学生有一只狗
 * - 第二个学生有两只狗
 * <p>
 * 预期输出
 * 学生(学号**)的信息：学号=**、姓名=**、年龄=**
 * 有xxx只狗狗：
 * 狗(编号**)的信息：编号=**、名称=**、颜色=**
 */
public class Student {
    // state
    String id;
    String name;
    int age;
    Dog[] dogs;

    // behavior
    public void show() {
        System.out.println("学生(学号" + id + ")的信息：学号=" + id + "、姓名=" + name + "、年龄=" + age);
        showDogs();
    }
    public void showDogs(){
        System.out.println("有" + dogs.length + "只狗狗:");
        for (Dog dog : dogs) {
            dog.show();
        }
    }
}



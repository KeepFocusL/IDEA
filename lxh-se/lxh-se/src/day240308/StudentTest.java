package day240308;


import day240306.Student1;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = Student.getInstance();
        System.out.println(student1);

        Student student2 = Student.getInstance();
        System.out.println(student2);

        Student student3 = Student.getInstance();
        System.out.println(student3);
        //思路
        //1.把构造器私有化 -> 问题 -> 外部不能new -> 在哪里new？
        //2.在类的内部 -> 内部哪里？
        // -state -> Student student = new Student();
        //3.进一步，验证在外部多次调用，还是不是同一个对象
        //4.优化代码，数据名从student改为instance
        //5.进一步优化，怎么让instance的值不被改变 -> 在new前加private
        //Student.instance = null;
        //6.进一步优化，引出final
        // 如果一个变量被赋值一次之后不允许在修改，就可以用final关键字修饰他

    }
}

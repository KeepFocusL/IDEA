package day240308.encapsulation.singleton_basic;

public class StudentTest {
    public static void main(String[] args) {
        // 课后练习
        /*Student student1 = new Student();
        System.out.println(student1);

        Student student2 = new Student();
        System.out.println(student2);*/

        // 如上所示：student1 和 student2 肯定不是同一个对象
        // 只要外部可以直接调用 new Student(...)，就不可能是同一个对象

        // === === ===

        // 那，如果我们的要求就是：“Student 类只能有一个实例对象”！该怎么做？
        // 思路
        //   1. 把构造器私有化 -> 问题 -> 外部不能 new -> 在哪里 new?
        //   2. 在类的内部 -> 内部哪里？
        //        - state -> Student student = new Student();
        //        - behavior
        Student student = Student.getInstance();
        System.out.println(student);
        //   3. 进一步，验证在外部多次调用，还是不是同一个对象
        //   4. 进一步优化，改名
        //   5. 进一步优化，怎么让 instance 的值不被改变
        //Student.instance = null;

        Student student2 = Student.getInstance();
        System.out.println(student2);

        //   6. 进一步优化，引出 final 关键字
        //      类似于 pi
        System.out.println(Math.PI);
    }
}

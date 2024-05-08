package day240508.abstract_demo.oop;

public class Person {
    //state
    String name;

    //constructor
    public Person(String name) {
        //初始化
        this.name = name;
    }

    //behavior
    public void adopt(Animal animal) {
        //新增需求:如果animal是狗，多打印一句：汪汪汪
        //可以回顾this和super关键字是在什么时候出现的
        if (animal instanceof Cat){
            System.out.println("喵喵喵......");
        }
        System.out.println(this.name + "养了一只" + animal.name);
    }
}

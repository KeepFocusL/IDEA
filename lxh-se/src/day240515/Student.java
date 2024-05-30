package day240515;

public class Student {
    String name;
    int age;
    // A - Z
    // 变量类型 变量名 = 变量值;
    char firstLetter;


    public Student(String name, char firstLetter, int age) {
        this.name = name;
        this.firstLetter = firstLetter;
        this.age = age;
        //this.xxx = this.age;
    }

    @Override
    public String toString() {
        return this.name + "(" + this.age + ")";
    }

    /*@Override
    public int compareTo(MyComparable other) {
        // 想让哪个地方“稳定”，同“可扩展”
        // 就在哪个地方进行抽象...
        // 不要再亲力亲为
        
        // 谁，来帮我处理以下
        // XXX.xxx|xxx()
        // 比较器.帮我处理
        // 比较器1（姓氏首字母比较器）.帮我处理
        // 比较器2（年龄比较器）.帮我处理
        // 比较器3.帮我处理
        // 比较器n.帮我处理

        // 思考：如果让这里写出代码之后，比较器是不用变化的

        return comparator.compare(this, other);

        *//*Student o = (Student) other;
        if (this.firstLetter == o.firstLetter) {
            return 0;
        } else if (this.firstLetter > o.firstLetter) {
            return 1;
        } else {
            return -1;
        }*//*
    }*/
}

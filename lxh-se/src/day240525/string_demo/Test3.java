package day240525.string_demo;

public class Test3 {
    public static void main(String[] args) {
        // 1. 通过阅读源码，我们知道：String、StringBuffer、StringBuilder 的底层都是用 char[] value; 存储
        // 2. 以 StringBuilder 为例，思考为什么我们可以一直调用 append(...) 往 char[] value 加内容
        //    背景：对于数组来说，需要确定类型和长度，同时长度一旦确定，就不能改变
        //    作答方式：阅读 StringBuilder 源码，截取阅读源码过程中你觉得是能说这个问题的关键代码配图，加上文字说明
        //    前提：断网，只能阅读源代码

        // 从阅读源码中获取灵感，然后：自定义一个 MyStringBuilder，模拟 StringBuilder 的核心功能。
        // 以终为始的方式
        MyStringBuilder myStringBuilder = new MyStringBuilder();
        myStringBuilder.append("abc").append("xyz");// 期待的功能：类似 StringBuilder，可以一直 append(...)
        System.out.println(myStringBuilder);//期待的输出：abcxyz
    }
}

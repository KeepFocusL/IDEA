package day240525.string_demo;

import java.util.Arrays;

public class MyStringBuilder extends AbstractMyStringBuilder {
    char[] value;

    //初始值为16
    public MyStringBuilder() {
        super(16);
    }//无参构造方法的初始容量为16，当超出容量新数组的容量为2×（16+1）=34。


    //自定义构造器的长度
    public MyStringBuilder(int capacity) {
        super(capacity);
    }

    public MyStringBuilder append(String str) {
        return this;
    }

    @Override
    public String toString() {
        return "MyStringBuilder{" +
                "value=" + Arrays.toString(value) +
                '}';
    }
}

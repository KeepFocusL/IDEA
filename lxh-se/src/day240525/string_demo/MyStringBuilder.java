package day240525.string_demo;

import java.util.Arrays;

public class MyStringBuilder {
    char[] value;

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

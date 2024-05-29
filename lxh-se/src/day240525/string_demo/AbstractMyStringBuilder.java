package day240525.string_demo;

public abstract class AbstractMyStringBuilder {
    char[] value;

    public AbstractMyStringBuilder(int capacity) {
        value = new char[capacity];
    }
}

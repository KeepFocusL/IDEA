package day240525.string_demo;

import day240508.CountTime.Algorithm;

public class StringPlus extends Algorithm {
    int count;

    public StringPlus(int count) {
        this.count = count;
    }

    @Override
    public void justDoIt() {
        String result = "";

        for (int i = 0; i < count; i++) {
            result += i;
        }
    }
}

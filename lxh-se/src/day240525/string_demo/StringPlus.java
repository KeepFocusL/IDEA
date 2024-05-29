package day240525.string_demo;

import day240508.CountTime.Algorithm;

public class StringPlus extends LoopAbleAlgorithm {

    public StringPlus(int count) {
        super(count);
    }

    @Override
    public void justDoIt() {
        String result = "";

        for (int i = 0; i < count; i++) {
            result += i;
        }
    }
}

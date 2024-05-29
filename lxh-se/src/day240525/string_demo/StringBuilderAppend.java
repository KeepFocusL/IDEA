package day240525.string_demo;

import day240508.CountTime.Algorithm;

public class StringBuilderAppend extends LoopAbleAlgorithm {

    public StringBuilderAppend(int count) {
        super(count);
    }

    @Override
    public void justDoIt() {
        StringBuffer sb1 = new StringBuffer();
        for (int i = 0; i < count; i++) {
            sb1.append(i);
        }
    }
}

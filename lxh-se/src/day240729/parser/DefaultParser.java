package day240729.parser;

import java.util.ArrayList;
import java.util.List;

public class DefaultParser implements Parser{
    @Override
    public List<String> parse(String html) {
        List<String> result = new ArrayList<>();
        result.add("苹果");
        result.add("小米");
        return result;
    }
}

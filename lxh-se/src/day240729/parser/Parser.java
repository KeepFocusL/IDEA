package day240729.parser;

import java.lang.reflect.Constructor;
import java.util.List;

public interface Parser {
    static Parser getParser(String parserName) {
        Parser parser;
        try {
            Class<?> downloaderClass = Class.forName(parserName);
            Constructor<?> declaredConstructor = downloaderClass.getDeclaredConstructor();
            parser = (Parser)declaredConstructor.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return parser;
    }

    List<String> parse(String html);
}

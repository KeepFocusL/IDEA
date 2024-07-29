package day240729.repository;

import java.util.List;

public class NopeRepository implements Repository {
    @Override
    public List<String> store(List<String> results) {
        System.out.println("已经把" + results + "储存完成");
        return results;
    }
}

package day240324.lonelyoop;

public class Test {
    public static void main(String[] args) {
        Describe describe1 = new Describe("person1");
        Person1 person1 = new Person1("没人诉苦");
        describe1.describeLonely(person1);
        Describe describe2 = new Describe("person2");
        Person1 person2 = new Person1("在一个集体但自己感觉还是一个人");
        describe2.describeLonely(person2);
    }
}

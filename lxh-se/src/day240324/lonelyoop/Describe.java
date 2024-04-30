package day240324.lonelyoop;

public class Describe {
    String name;

    public Describe(String name) {
        this.name = name;
    }

    public void describeLonely(Lonely lonely) {
        System.out.println(this.name + "认为的孤独:" + lonely.lonely);
    }
}

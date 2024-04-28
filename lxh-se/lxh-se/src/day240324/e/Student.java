package day240324.e;

public class Student extends Person {
    public Student(String name) {
        super(name);
    }

    @Override
    public void describeLonely(String text) {
        System.out.println(text);
    }
    //你没资格重写我了
//    @Override
//    public final void judgeXDD(String text) {
//        System.out.println(text);
//    }
}

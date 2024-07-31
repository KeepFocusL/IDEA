package day240730.singleton_demo;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = Student.STUDENT;
        Student s2 = Student.STUDENT;

        //这里用equals验证其实是不严谨的,如果equals被人重写了,比较的就不是本身的值了,会比较地址值(**@***)
        System.out.println(s1.equals(s2));

        System.out.println(s1 == s2);

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}

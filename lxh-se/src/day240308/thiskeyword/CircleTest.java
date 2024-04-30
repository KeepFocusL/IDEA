
package day240308.thiskeyword;

public class CircleTest {
    public CircleTest() {
    }

    public static void main(String[] args) {
        Circle circle = new Circle(3.0);
        System.out.println("circle=" + String.valueOf(circle));
        System.out.println(circle.area());
        Circle circle2 = new Circle(2.0);
        System.out.println("circle=" + String.valueOf(circle2));
        System.out.println(circle2.area());
    }
}

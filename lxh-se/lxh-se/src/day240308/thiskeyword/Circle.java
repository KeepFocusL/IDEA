package day240308.thiskeyword;

public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
        System.out.println("this=" + String.valueOf(this));
    }

    public double area() {
        return 3.14 * this.radius * this.radius;
    }
}

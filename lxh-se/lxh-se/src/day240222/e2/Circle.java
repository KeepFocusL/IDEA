package day240222.e2;

/**
 * 面向对象思维练习 2
 * <p>
 * 利用面向对象的编程方法，设计一个圆形的类 Circle
 *   - 自己思考需要哪些 state
 *   - 指定必须提供计算圆面积的方法 behavior
 */
public class Circle {
    // state
    double radius;
    private static double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    // behavior
    public double area() {
        return pi * radius * radius;
    }
}
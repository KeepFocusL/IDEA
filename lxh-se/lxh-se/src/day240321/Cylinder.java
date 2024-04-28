package day240321;

public class Cylinder extends Circle {
    private double length;

    public Cylinder() {
        length = 1;
    }

    private double length() {
        return length;
    }

    //constructor
    public double getLength() {
        this.length = length;
        return getRadius();
    }

    public void setLength(double length) {
        this.length = length;
    }

}
package exer04Circle;

public class Cylinder extends Circle {
    private double length;

    public Cylinder() {
        this.length = 1;
    }

    public Cylinder(double length) {
        this.length = length;
    }

    public Cylinder(double radius, double length) {
        this.length = length;
        this.setRadius(radius);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double findVolume() {
        return this.length * findArea();

    }


}

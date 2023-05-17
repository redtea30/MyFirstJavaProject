package exer09tostring.test1;

public class Circle extends GeometricObject {
    private double radius;

    public Circle() {

        color = "white";
        weight = 1.0;
    }

    public Circle(double radius) {
        color = "white";
        weight = 1.0;
        this.radius = radius;
    }

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Circle) {
            Circle c = (Circle) obj;
            return this.radius == c.radius;

        }
        return false;
    }

    public String toString() {
        return "Circle[radius = " + radius + " ]";
    }

}

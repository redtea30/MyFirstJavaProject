package triangle;

public class Triangle {
    private double height;
    private double base;

    public void setHeight(double n) {
        height = n;
    }

    public void setBase(double n) {
        base = n;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    //构造器
    public Triangle() {
    }
    //构造器
    public Triangle(double h, double b) {
        base = b;
        height = h;
    }
    //方法
    public double findArea() {
        return (base * height) / 2;
    }


}

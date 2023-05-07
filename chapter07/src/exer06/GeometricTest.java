package exer06;

public class GeometricTest {
    public static void main(String[] args) {
        GeometricTest testEquals = new GeometricTest();
        Circle p1 = new Circle("Blue", 1, 2);
        MyRectangle p2 = new MyRectangle("b", 1, 2, 2);
        if (p1.findArea() == p2.findArea()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        testEquals.displayGeometricObject(p1);
        testEquals.displayGeometricObject(p2);


        boolean test1 = testEquals.equalsArea(p1, p2);
        if (test1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }


testEquals.displayGeometricObject(p1);


    }


    //equals()
    public boolean equalsArea(GeometricObject g1, GeometricObject g2) {
        return g1.findArea() == g2.findArea();
    }


    public void displayGeometricObject(GeometricObject g) {
        System.out.println("几何图形的面积为：" + g.findArea());
    }
}

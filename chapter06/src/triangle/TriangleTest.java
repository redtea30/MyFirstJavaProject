package triangle;

public class TriangleTest {
    public static void main(String[] args) {
        //未使用构造器
        Triangle p1 = new Triangle();
        p1.setBase(3.5);
        p1.setHeight(3.9);
        double area1 = p1.findArea();
        System.out.println(area1);
        //使用构造器
        Triangle p2 = new Triangle(6.9, 7.9);
        System.out.println(p2.getHeight());
        System.out.println(p2.getBase());
        System.out.println(p2.findArea());


    }


}

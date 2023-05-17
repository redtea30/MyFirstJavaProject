package exer09tostring.test1;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.3);
        Circle c2 = new Circle("white", 3.9, 3);
        System.out.println("颜色是否相等？" + c1.getColor().equals(c2.getColor()));
        System.out.println("半径是否相等？" + c1.equals(c2));

    }
}

package Circle;

/* *      定义一个类PassObject，在类中定义一个方法printAreas()，该方法的定义如下：
 *      public void printAreas(Circle c, int time)。
 *
 *      在printAreas方法中打印输出1到time之间的每个整数半径值，以及对应的面积。
 *     例如，time为5，则输出半径1，2，3，4，5，以及对应的圆面积。*/
public class CircleTest {
    public static void main(String[] args) {
        CircleTest obj = new CircleTest();
        Circle circle = new Circle();
        obj.printAreas(circle, 5);


    }

    public void printAreas(Circle c, int time) {
        int i;
        for (i = 1; i < time + 1; i++) {
            c.radius = i;
            System.out.println(c.radius + "\t\t\t\t\t" + c.findArea());
        }
    }

}



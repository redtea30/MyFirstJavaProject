package Test3;

public class Test3Test {

    public static void main(String[] args) {

/*1. 编写程序，声明一个method1方法，在方法中打印一个10*8 的*型矩形，在main方法中调用该方法。

2. 编写程序，声明一个method2方法，除打印一个10*8的*型矩形外，
再计算该矩形的面积，并将其作为方法返回值。在main方法中调用该方法，接收返回的面积值并打印。

3. 编写程序，声明一个method3方法，在method3方法提供m和n两个参数，方法中打印一个m*n的*型矩形，
并计算该矩形的面积，将其作为方法返回值。在main方法中调用该方法，接收返回的面积值并打印。*/


        Test p1 = new Test();
        p1.method1();
        System.out.println(p1.method2());
        System.out.println(p1.method3());

//        p1.method3();


    }
}

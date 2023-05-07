package Test3;

import java.util.Scanner;

public class Test {
    /*1. 编写程序，声明一个method1方法，在方法中打印一个10*8 的*型矩形，在main方法中调用该方法。
    2. 编写程序，声明一个method2方法，除打印一个10*8的*型矩形外，
    再计算该矩形的面积，并将其作为方法返回值。在main方法中调用该方法，接收返回的面积值并打印。
    3. 编写程序，声明一个method3方法，在method3方法提供m和n两个参数，方法中打印一个m*n的*型矩形，
    并计算该矩形的面积，将其作为方法返回值。在main方法中调用该方法，接收返回的面积值并打印。*/
    int i, j;

    public void method1() {
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 8; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public int method2() {
        method1();
        return 10 * 8;
    }

    public int method3() {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入长度m");
        int m = input.nextInt();
        System.out.println("请输入长度n");
        int n = input.nextInt();
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        input.close();
        return (i + 1) * (j + 1);

    }


}

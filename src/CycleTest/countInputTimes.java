package CycleTest;

import java.util.Scanner;

public class countInputTimes {
    public static void main(String[] args) {
        //练习：**从键盘输入整数，输入0结束，统计输入的正数、负数的个数。
        Scanner input = new Scanner(System.in);
        int negativeNumber = 0;
        int positiveNumber = 0;
        int num = 1;
        while (num != 0) {
            System.out.println("type a number here:");
            num = input.nextInt();
            if (num > 0) {
                positiveNumber++;
            } else if (num < 0) {
                negativeNumber++;
            } else {
                System.out.println("Game over");
            }


        }
        System.out.println("Positive number has " + positiveNumber + " Negative number has " + negativeNumber);


    }
}

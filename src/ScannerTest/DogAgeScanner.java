package ScannerTest;

import java.util.Scanner;

/*我家的狗5岁了，5岁的狗相当于人类多大呢？其实，狗的前两年每一年相当于人类的10.5岁，之后每增加一年就增加四岁。那么5岁的狗相当于人类多少年龄呢？应该是：10.5 + 10.5 + 4 + 4 + 4 = 33岁。

        编写一个程序，获取用户输入的狗的年龄，通过程序显示其相当于人类的年龄。如果用户输入负数，请显示一个提示信息。*/
public class DogAgeScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入狗的年龄：");
        int age = input.nextInt();
        if (age <= 2) {
            System.out.println("狗的年龄是： " + (age * 10.5));
        } else if (age >= 3) {
            System.out.println("狗的年龄是： " + (20.5 + (age - 2) * 4));
        } else {
            System.out.println("你输入的有误");
        }
        input.close();
    }
}

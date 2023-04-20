package ScannerTest;

import java.util.Scanner;

/***案例：**小明注册某交友网站，要求录入个人相关信息。如下：
 请输入你的网名、你的年龄、你的体重、你是否单身、你的性别等情况。*/
public class MingScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入你的网名");
        String name = input.next();
        System.out.println("你的年龄");
        int age = input.nextInt();
        System.out.println("你的体重");
        double weight = input.nextDouble();
        System.out.println("你是否单身（true/false)");
        boolean marriage = input.nextBoolean();
        System.out.println("你的性别等情况");
        char gender = input.next().charAt(0);
        System.out.println("你的情况如下");
        System.out.println("Name" + name + "\nWeight" + weight + "\nMarriage" + marriage + "\ngender" + gender);

        input.close();
    }
}

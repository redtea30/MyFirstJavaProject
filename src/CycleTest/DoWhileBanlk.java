package CycleTest;

import java.util.Scanner;

public class DoWhileBanlk {
    public static void main(String[] args) {
        /*声明变量balance并初始化为0，用以表示银行账户的余额，下面通过ATM机程序实现存款，取款等功能。

=========ATM========
   1、存款
   2、取款
   3、显示余额
   4、退出
请选择(1-4)：*/
        double balance = 0.0;
        Scanner input = new Scanner(System.in);
        boolean quit = true;
        do {
            System.out.println(" =========ATM======== \n1、存款 \n2、取款 \n3、显示余额 \n4、退出 \n请选择(1-4)：");
            int userInput = input.nextInt();
            switch (userInput) {
                case 1:
                    System.out.println("请输入你想要存的金额");
                    double deposit = (double) input.nextDouble();
                    if (deposit >= 0) {
                        balance += deposit;
                    } else {
                        System.out.println("你输入的有误");
                    }
                    break;
                case 2:
                    System.out.println("请输入你想要取的金额");
                    double withdraw = (double) input.nextDouble();
                    if (withdraw >= 0) {
                        if ((balance - withdraw) <= 0) {
                            System.out.println("your account not have enough money!");
                            break;
                        } else {
                            balance -= withdraw;
                        }
                    } else {
                        System.out.println("你输入的有误");
                    }
                    break;
                case 3:
                    System.out.println("当前余额：" + balance);
                    break;
                case 4:
                    System.out.println("退出中..");
                    quit =false;
                    break;
                default:
                    System.out.println("请重新输入");
            }
        } while (quit);
        input.close();
    }

}

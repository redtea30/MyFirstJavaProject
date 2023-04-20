package ScannerTest;

import java.util.Scanner;

public class ScannerTest1 {
    public static void main(String[] args) {
//        案例4：**编写程序：从键盘上输入2023年的“month”和“day”，要求通过程序输出输入的日期为2023年的第几天。
        Scanner scan = new Scanner(System.in);
        System.out.println("Please type in the Year: ");
        int year = scan.nextInt();
        System.out.println("Please type in the Month: ");
        int month = scan.nextInt();
        System.out.println("Please type in the Day: ");
        int day = scan.nextInt();
        int totalDays = 0;
        switch (month) {
            case 12:
                totalDays += 31;
            case 11:
                totalDays += 30;
            case 10:
                totalDays += 31;
            case 9:
                totalDays += 30;
            case 8:
                totalDays += 31;
            case 7:
                totalDays += 31;
            case 6:
                totalDays += 30;
            case 5:
                totalDays += 31;
            case 4:
                totalDays += 30;
            case 3:
                totalDays += 31;
            case 2:
                totalDays += 28;
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    ++totalDays;
                }
            case 1:
                totalDays += day;
        }
        System.out.println("(Year: "+year+" month: " + month + " Day: " + day + ") is the " + totalDays + " days in this years.");

        scan.close();

/*        从键盘分别输入年、月、日，判断这一天是当年的第几天
        注：判断一年是否是闰年的标准：
        1）可以被4整除，但不可被100整除
           或
        2）可以被400整除
        例如：1900，2200等能被4整除，但同时能被100整除，但不能被400整除，不是闰年*/


    }
}

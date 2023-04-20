package ScannerTest;

import java.util.Scanner;

public class WeekSwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a day in week: ");
        int week = input.nextInt();
        switch (week) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Please type again");
                break;

        }
        input.close();
    }
}

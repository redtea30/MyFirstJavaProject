package ScannerTest;

import java.util.Scanner;

public class SeasonIfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please input a month: ");
        int month = input.nextInt();
        if (month == 3 || month == 4 || month == 5) {
            System.out.println("Spring");
        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("Summer");
        } else if (month == 9 || month == 10 || month == 11) {
            System.out.println("Autumn");
        } else if (month == 12 || month == 1 || month == 2) {
            System.out.println("Winter");
        } else {
            System.out.println("please try again");
        }
        input.close();
    }
}

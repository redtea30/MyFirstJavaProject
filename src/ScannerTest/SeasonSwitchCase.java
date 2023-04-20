package ScannerTest;

import java.util.Scanner;

/*
 * 需求：指定一个月份，输出该月份对应的季节。一年有四季:
 * 		3,4,5	春季
 * 		6,7,8	夏季
 * 		9,10,11	秋季
 * 		12,1,2	冬季
 */
public class SeasonSwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please type a month: ");
        int month = input.nextInt();
        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
        }
        input.close();
    }
}

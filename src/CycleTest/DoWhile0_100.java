package CycleTest;

import java.util.Scanner;

public class DoWhile0_100 {
    public static void main(String[] args) {
//        案例1：**遍历1-100的偶数，并计算所有偶数的和、偶数的个数（累加的思想）
        int num = 1;
        int count = 0;
        int total = 0;
        do {
            if (num % 2 == 0) {
                count++;
                total += num;
            }
            num++;
        } while (num < 101);
        System.out.println("count-" + count + "\ntotal-" + total);

/***练习1：**随机生成一个100以内的数，猜这个随机数是多少？
 从键盘输入数，如果大了提示，大了；如果小了，提示小了；如果对了，就不再猜了，并统计一共猜了多少次。*/

        Scanner input = new Scanner(System.in);
        int randomNum = (int) (Math.random() * 100);
        count = 1;
        boolean guessCorrect = true;
        int guessNum;
        do {
            System.out.println("please type a number: ");
            guessNum = input.nextInt();
            if (guessNum > randomNum) {
                System.out.println("大了");
                count++;
            } else if (guessNum < randomNum) {
                System.out.println("小了");
                count++;
            }
        } while (guessNum!=randomNum);
        System.out.println("Correct! you have guessed " + count + " times!");
        input.close();
    }
}

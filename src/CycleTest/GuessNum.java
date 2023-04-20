package CycleTest;

import java.util.Scanner;

public class GuessNum {
    public static void main(String[] args) {
/*        随机生成一个100以内的数，猜这个随机数是多少？
        从键盘输入数，如果大了，提示大了；如果小了，提示小了；如果对了，就不再猜了，并统计一共猜了多少次。
        提示：生成一个[a,b] 范围的随机数的方式：(int)(Math.random() * (b - a + 1) + a)*/
        Scanner input = new Scanner(System.in);

/*        int randomMath = (int) (Math.random() * 100);
        int guessTime=1;
        int guess = 0;
        while (guess != randomMath) {
            System.out.println("please guess a number");
            guess = input.nextInt();
            if (guess > randomMath) {
                System.out.println("猜的大了");
            }
            if (guess < randomMath) {
                System.out.println("猜的小了");
            }
            if (guess == randomMath) {
                System.out.println("猜对了");
            }
            guessTime++;
        }
System.out.println("Guess times: "+ guessTime);*/

        //世界最高山峰是珠穆朗玛峰，它的高度是8848.86米，假如我有一张足够大的纸，它的厚度是0.1毫米。
        //请问，我折叠多少次，可以折成珠穆朗玛峰的高度?
        double paper = 0.1;
        int mountain = 8848640;
        int fold = 0;
        while (paper <= mountain) {
            paper *= 2;
            fold++;
        }
        paper/=1000;
        System.out.println("paper height: " + paper + "meters, fold times: " + fold);


    }
}

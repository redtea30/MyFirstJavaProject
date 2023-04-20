package ScannerTest;

import java.util.Scanner;

//使用 switch 把小写类型的 char型转为大写。只转换 a, b, c, d, e. 其它的输出 “other”。
public class abcdeSwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入英文字母小写，a,b,c,d,e");
        char word = input.next().charAt(0);
        switch (word) {
            case 'a':
                System.out.println("A");
                break;
            case 'b':
                System.out.println("B");
                break;
            case 'c':
                System.out.println("C");
                break;
            case 'd':
                System.out.println("D");
                break;
            case 'e':
                System.out.println("E");
                break;
            default:
                System.out.println("你输入的有误");
                break;
        }
        input.close();
    }
}

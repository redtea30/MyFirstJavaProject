package hashset;

import java.util.HashSet;
import java.util.Scanner;

//使用Scanner从键盘读取一行输入，去掉其中重复字符，打印出不同的那些字符。比如：aaaabbbcccddd
public class Exer03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一行字符串");
        String line = input.next();
        char[] arr = line.toCharArray();
        HashSet hs = new HashSet();
        for (Object obj : arr) {
            hs.add(obj);
        }
        for (Object obj : hs) {
            System.out.println(obj);
        }
    }
}

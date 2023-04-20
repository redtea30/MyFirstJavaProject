package ScannerTest;

import java.util.Scanner;

/*大家都知道，男大当婚，女大当嫁。那么女方家长要嫁女儿，当然要提出一定的条件：高：180cm以上；富：财富1千万以上；帅：是。

        如果这三个条件同时满足，则：“我一定要嫁给他!!!”
        如果三个条件有为真的情况，则：“嫁吧，比上不足，比下有余。”
        如果三个条件都不满足，则：“不嫁！”*/
public class MarriageScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入身高： ");
        Double height = input.nextDouble();
        System.out.println("请输入银行卡余额（单位千万）：");
        int money = input.nextInt();
        System.out.println("长得帅么（true/false）：");
        boolean handsome = input.nextBoolean();
        if (height >= 180 && money >= 1 && handsome == true) {
            System.out.println("我一定要嫁给他!!!");
        } else if (height >= 180 || money >= 1 || handsome == true) {
            System.out.println("嫁吧，比上不足，比下有余。");
        } else {
            System.out.println("不嫁！");
        }

        input.close();
    }
}

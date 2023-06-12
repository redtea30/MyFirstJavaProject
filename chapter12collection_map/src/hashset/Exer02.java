package hashset;

import java.util.HashSet;
import java.util.Random;

//编写一个程序，获取10个1至20的随机数，要求随机数不能重复。并把最终的随机数输出到控制台。
public class Exer02 {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        Random r = new Random();
        while (hs.size() < 10) {
            int num = r.nextInt(20) + 1;
            hs.add(num);
        }
        for (Object integer : hs) {
            System.out.println(integer);/*1
18
3
20
6
8
11
12
13
14*/
        }
    }
}

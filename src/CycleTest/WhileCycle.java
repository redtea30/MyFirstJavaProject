package CycleTest;
import java.util.Scanner;
public class WhileCycle {
    public static void main(String[] args) {
        int count = 0;
        int total = 0;
        int i = 1;
        while (i < 100) {
            if (i % 2 == 0) {
                total += i;
                count++;
            }
            i++;
        }
        System.out.println("total\t" + total + "\tcount\t" + count);



    }
}

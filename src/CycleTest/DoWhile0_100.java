package CycleTest;

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







    }
}

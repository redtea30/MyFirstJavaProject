package CycleTest;

public class PrimeNum {
    public static void main(String[] args) {
        int i, j;
        //方式1
/*        for (i = 1; i < 100000; i++) {
            int count = 0;
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println(i);
            }
        }*/

        //方式2
        boolean isflag = true;
/*        for (i = 1; i < 100000; i++) {
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    isflag = false;
                }
            }
            if (isflag) {
                System.out.println(i);
            }
            isflag = true;
        }*/


        //优化（直接显示个数）
        long start = System.currentTimeMillis();
        int count = 0;
        isflag = true;
        for (i = 2; i < 100000; i++) {
            for (j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isflag = false;
                    break;
                }
            }
            if (isflag) {
                count++;
            }
            isflag = true;
        }
        long end = System.currentTimeMillis();
        System.out.println("质数的个数为： " + count + " 个。");//9592
        System.out.println("花费的时间为： " + (end - start));//17006未优化->1563break->15Math.sqrt()
    }
}

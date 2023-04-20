package CycleTest;

public class ForCycle {
    public static void main(String[] args) {
//        题目：输出5行HelloWorld
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello world!");
        }

//遍历100以内的所有偶数，找出个数以及和
        int count, total;
        total = 0;
        count = 0;
        for (int i1 = 1; i1 < 101; i1++) {
            if (i1 % 2 == 0) {
                total += i1;
                count++;
            }
        }
        System.out.println(total + "-total" + count + "-count");

//打印所有奇数的和
        total = 0;
        for (int i2 = 1; i2 < 101; i2++) {
            if (i2 % 2 != 0) {
                total += i2;
            }
        }
        System.out.println(total + "-total");
        //练习2：**打印1~100之间所有是7的倍数的整数的个数及总和（体会设置计数器的思想）
        total = 0;
        count = 0;
        for (int i1 = 1; i1 < 101; i1++) {
            if (i1 % 7 == 0) {
                total += i1;
                count++;
            }
        }
        System.out.println(total + "-total" + count + "-count");
        //**练习3：**
        //编写程序从1循环到150，并在每行打印一个值，另外在每个3的倍数行上打印出“foo”,在每个5的倍数行上打印“biz”,在每个7的倍数行上打印输出“baz”。
        for (int i3 = 1; i3 < 151; ++i3) {
            System.out.print(i3 + "\t");
            if (i3 % 3 == 0) {
                System.out.print("foo\t");
            }
            if (i3 % 5 == 0) {
                System.out.print("biz\t");
            }
            if (i3 % 7 == 0) {
                System.out.print("baz\t");
            }
            System.out.println();
        }
//while 写法Hello World！
        int i4=1;
        while(i4<6){
            System.out.println("Hello world!");
            i4++;
        }


    }
}

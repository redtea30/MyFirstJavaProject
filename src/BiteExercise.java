public class BiteExercise {
    public static void main(String[] args) {
        int m = 11223;
        int n = 9999;

        //change to vairable values
        //way1 都适用
        int temp = m;
        m = n;
        n = temp;
        System.out.println("m: " + m + " n: " + n);
        //way2 只适用于数字类型
        int m1 = 11223;
        int n1 = 9999;
        m1 = m1 + n1;
        n1 = m1 - n1;
        m1 = m1 - n1;
        System.out.println("m1: " + m1 + " n1: " + n1);
        //way3 只适用于数字类型
        int m2 = 11223;
        int n2 = 9999;
        m2 = m2 ^ n2;
        n2 = m2 ^ n2; //(m2 ^ n2) ^ n2
        m2 = m2 ^ n2;
        System.out.println("m2 = " + m2 + ", n2 = " + n2);


        //今天是周二十天后周几
        int week = 2;
        week = +10;
        week%=7;
        System.out.println("十天后是： 周"+week);
        System.out.println("十天后是： 周"+((week==0)?"日":week));
        //周日
        week =0;
        System.out.println("十天后是： 周"+((week==0)?"日":week));
    }
}

package Exercise04recusion;

public class RecursionExer01 {
//    练习1：
//    已知一个数列：f(20) = 1,f(21) = 4,f(n+2) = 2*f(n+1)+f(n),
//    其中n是大于0的整数，求f(10)的值。

    public int f(int n) {
        if (n == 20) {
            return 1;
        } else if (n == 21) {
            return 4;
        } else {
            return f(n + 2) - 2 * f(n + 1);
        }
    }


    //    练习2：
//    已知有一个数列：f(0) = 1,f(1) = 4,
//    f(n+2)=2*f(n+1) + f(n),其中n是大于0的整数，求f(10)的值。

    public int f1(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 4;
        } else {
            return f1(n - 2) + 2 * f1(n - 1);
        }
    }

    //斐波那契数列，不死兔子
    public int rabbit(int month) {
        if (month == 1) {
            return 1;
        } else if (month == 2) {
            return 1;
        } else {
            return rabbit(month - 1) + rabbit(month - 2);
        }

    }

    //走台阶问题，10级台阶，小朋友每次只能走一阶或者两阶台阶---斐波那契数列

    public static void main(String[] args) {
        RecursionExer01 test = new RecursionExer01();
        int n = 10;
        //
        int fun1 = test.f(n);
        System.out.println(fun1);
        //
        int fun2 = test.f1(n);
        System.out.println(fun2);

        RecursionExer01 getrabbit = new RecursionExer01();
        int month = 30;
        int num = getrabbit.rabbit(month);
        System.out.println("the rabbit has "+num);
    }


}

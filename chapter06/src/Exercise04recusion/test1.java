package Exercise04recusion;

public class test1 {
    public static void main(String[] args) {
/*        练习1：
        已知一个数列：f(20) = 1,f(21) = 4,f(n+2) = 2*f(n+1)+f(n),
                其中n是大  于0的整数，求f(10)的值。*/

//        Function result = new Function();
//        System.out.println(function1(10));

/*        练习2：
        已知有一个数列：f(0) = 1,f(1) = 4,
                f(n+2)=2*f(n+1) + f(n),其中n是大于0的整数，求f(10)的值。*/
//        result.function2(10);

    }

    /*        练习1：
        已知一个数列：f(20) = 1,f(21) = 4,f(n+2) = 2*f(n+1)+f(n),
                其中n是大于0的整数，求f(10)的值。*/

    class Function {
        public int function1(int n) {
            if (n == 20) {
                return 1;
            } else if (n == 21) {
                return 4;
            } else {
                return function1(n + 2) - 2 * function1(n + 1);
            }
        }

        /*        练习2：
                已知有一个数列：f(0) = 1,f(1) = 4,
                        f(n+2)=2*f(n+1) + f(n),其中n是大于0的整数，求f(10)的值。*/
        public int function2(int n) {
            if (n == 0) {
                return 1;
            } else if (n == 1) {
                return 4;
            } else {
                return 2 * function2(n - 1) + function2(n - 2);
            }
        }

    }
}

package Exercise04recusion;

public class Recursion {


    public static void main(String[] args) {
        Recursion total = new Recursion();
        int n = 10;
        //
        int sum = total.getsum(n);
        System.out.println(sum);
        //
        int sum1 = total.getsum1(n);
        System.out.println(sum1);
        //
        int mul1 = total.getMul(n);
        System.out.println(mul1);
        //
        int fibonacci1 =total.fibonacci(n);
        System.out.println(fibonacci1);
        int fibonacci2 =total.fibonacci(20);
        System.out.println(fibonacci2);

    }

    public int getsum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + getsum(n - 1);
    }

    public int getsum1(int n) {
        if (n == 1) {
            return 1;
        }
        return n + getsum1(n - 1);
    }

    public int getMul(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * getMul(n - 1);
        }
    }

    public int fibonacci(int n) {
        //1 1 2 3 5 8 13 21 34 55 .....
        //f(n)=f(n-1)+f(n-2)
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }


    }

}

package exer08equals.test1;

import static java.lang.System.out;

public class CustomerTest {
    public static void main(String[] args) {
        Customer c1 = new Customer("Tom", 18, new Account(1001));
        Customer c2 = new Customer("Tom", 18, new Account(1001));
        out.println(c1.equals(c2));

    }
}

package exer02;

public class BankTest {
    static Bank b1 = null;
    static Bank b2 = null;

    public static void main(String[] args) {

        Thread t1 = new Thread() {
            public void run() {
                b1 = Bank.getInstance();
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                b2 = Bank.getInstance();
            }
        };
        t1.start();
        t2.start();





    }
}


class Bank {
    private Bank() {
    }

    private static Bank instance = null;

    public static Bank getInstance() {
        return instance;
    }

}
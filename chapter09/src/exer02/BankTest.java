package exer02;

//查看线程安全性，或者地址值？
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
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b1 == b2);

    }
}


class Bank {
    private Bank() {
    }

    private static volatile Bank instance = null;
//way1
/*    public static synchronized Bank getInstance() {
        if (instance == null) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            instance = new Bank();
        }
        return instance;
    }*/

    //way2
/*    public static Bank getInstance() {
        if (instance == null) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                 e.printStackTrace();
            }
            instance = new Bank();
        }

        return instance;
    }*/

    //way3

    public static Bank getInstance() {
        if (instance == null) {
            synchronized (Bank.class) {

                if (instance == null) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    instance = new Bank();
                }
            }

        }


        return instance;
    }


}



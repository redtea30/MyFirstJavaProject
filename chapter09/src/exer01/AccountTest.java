package exer01;

/*
银行有一个账户。

有两个储户分别向同一个账户存3000元，每次存1000，存3次。每次存完打印账户余额。
问题：该程序是否有安全问题，如果有，如何解决？

【提示】
1，明确哪些代码是多线程运行代码，须写入run()方法
2，明确什么是共享数据。
3，明确多线程运行代码中哪些语句是操作共享数据的。*/
public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();
        Customer c1 = new Customer("王一", account);
        Customer c2 = new Customer("王二", account);
        c1.start();
        c2.start();


    }
}

class Account {
    private double balance;

    public synchronized void deposit(double amt) {
        if (amt > 0) {
            balance += amt;
        }
        System.out.println(Thread.currentThread().getName() + "存钱1000元，卡里的余额为： " + balance);

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Customer extends Thread {
    Account account;

    public Customer(Account account) {
        this.account = account;
    }

    public Customer(String name, Account account) {
        super(name);
        this.account = account;
    }

    public void run() {

        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            account.deposit(1000);

        }
    }
}


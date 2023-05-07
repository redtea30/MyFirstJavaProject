package exer02;

public class Account {
    private double balance;

    public Account(double init_balance) {
        this.balance = init_balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amt) {
        if (amt > 0) {
            System.out.println("successful deposit $ " + amt);
            balance += amt;
        } else {
            System.out.println("you type wrong here");
        }
    }

    public void withdraw(double amt) {
        if (balance >= amt) {
            System.out.println("successful withdraw ");
            balance -= amt;
        } else {
            System.out.println("you type wrong here");
        }
    }
}

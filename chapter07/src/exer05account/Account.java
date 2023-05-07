package exer05account;

public class Account {
    private int id;
    private double balance;
    private double annuallnterestRate;

    public Account(int id, double balance, double annuallnterestRate) {
        this.id = id;
        this.balance = balance;
        this.annuallnterestRate = annuallnterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnuallnterestRate() {
        return annuallnterestRate;
    }

    public void setAnnuallnterestRate(double annuallnterestRate) {
        this.annuallnterestRate = annuallnterestRate;
    }

    public double getMonthlyinterest() {
        return getAnnuallnterestRate() / 12;
    }

    public void withdraw(double amount) {
        if (amount > getBalance()) {
            System.out.println("余额不足！");
        } else if (amount <= getBalance()) {
            balance -= amount;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}

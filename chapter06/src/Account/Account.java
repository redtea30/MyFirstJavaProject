package Account;

public class Account {
    private int id;
    private double balance;
    private double annuallnterestRate;

    public  Account(int i, double b, double a) {
        id = i;
        balance = b;
        annuallnterestRate = a;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnuallnterestRate() {
        return annuallnterestRate;
    }

    public void setId(int i) {
        id = i;
    }

    public void setBalance(double b) {
        balance = b;
    }

    public void setAnnuallnterestRate(double a) {
        annuallnterestRate = a;
    }

    public void withdraw(double amount)//取钱
    {
        if (balance <= amount && amount < 0) {
            System.out.print("你输入的有误");
        } else {
            balance -= amount;
            System.out.println("取款成功 $" + amount);
        }
    }

    public void deposit(double amount)//存钱
    {
        if (amount > 0) {
            System.out.println("成功存款 $" + amount);
            balance += amount;
        } else {
            System.out.println("你输入的有误");
        }
    }


}


package exer05account;

public class CheckAccount extends Account {
    private double overdraft;

    public CheckAccount(int id, double balance, double annuallnterestRate) {
        super(id, balance, annuallnterestRate);
    }

    public CheckAccount(int id, double balance, double annuallnterestRate, double overdraft) {
        super(id, balance, annuallnterestRate);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            super.withdraw(amount);
        } else if (amount <= getBalance() + overdraft) {
            overdraft -= amount - super.getBalance();
            super.withdraw(getBalance());
        } else {
            System.out.println("超过可透支限额！");
        }

    }


}

package exer05account;

public class AccountTest {
    public static void main(String[] args) {
        Account p1 = new Account(1122, 20000, 0.045);
        p1.withdraw(30000);
        System.out.println("您账户的余额为： " + p1.getBalance());
        System.out.println();
        p1.withdraw(2500);
        p1.deposit(3000);
        System.out.println("您账户的余额为： " + p1.getBalance());
        System.out.println("月利率为为： " + p1.getMonthlyinterest());

    }
}

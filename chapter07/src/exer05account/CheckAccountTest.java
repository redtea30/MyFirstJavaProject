package exer05account;

public class CheckAccountTest {
    public static void main(String[] args) {

        CheckAccount p1 = new CheckAccount(1122, 20000, 0.045, 5000);
        p1.withdraw(5000);
        System.out.println("您的帐户余额： "+p1.getBalance() );
        System.out.println("您的可透支额度： "+p1.getOverdraft() );
        System.out.println();
        p1.withdraw(18000);
        System.out.println("您的帐户余额： "+p1.getBalance() );
        System.out.println("您的可透支额度： "+p1.getOverdraft() );
        System.out.println();
        p1.withdraw(3000);
        System.out.println();
        System.out.println("您的帐户余额： "+p1.getBalance() );
        System.out.println("您的可透支额度： "+p1.getOverdraft() );
    }
}

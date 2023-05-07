package exer02;

public class BankTest {
    public static void main(String[] args) {

        Bank bank = new Bank();
        bank.addCustomer("王", "安石");
        bank.addCustomer("徐", "福");

        bank.getCustomer(0).setAccount(  new Account(1000));
        bank.getCustomer(0).getAccount().withdraw(59);


        System.out.println();
        System.out.println();
        System.out.println();


    }
}

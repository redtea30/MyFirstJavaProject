package Account;

public class CustomerTest {
    public static void main(String[] args) {
/*（1）创建一个Customer ，名字叫 Jane Smith, 他有一个账号为1000，余额为2000元，年利率为 1.23％ 的账户。
（2）对Jane Smith操作。
    存入 100 元，再取出960元。再取出2000元。
    打印出Jane Smith 的基本信息*/

        Customer p1 = new Customer("Jane", "Smith");
        p1.setAccount(new Account(1000, 2000, 0.0123));

        p1.getAccount().deposit(100);
        p1.getAccount().withdraw(960);
        p1.getAccount().withdraw(960);
        System.out.println("name [ " + p1.getFirstName() + " " + p1.getLastName() + " ] has a account id is : " +
                +p1.getAccount().getId() + " annuallnterestRate is " + p1.getAccount().getAnnuallnterestRate() * 100
                + " balance is " + p1.getAccount().getBalance());

    }


}

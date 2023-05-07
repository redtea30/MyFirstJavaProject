package exer02;

public class Bank {

    private Customer[] customers;
    private int numberOfCustomer;

    public Bank() {
        customers = new Customer[10];
    }

    public void addCustomer(String f, String l) {
        Customer cust = new Customer(f, l);
        customers[numberOfCustomer++] = cust;

    }

    public int getNumOfCustomer() {
        return numberOfCustomer;
    }

    public Customer getCustomer(int index) {
        if (index >= 0 && index <= numberOfCustomer) {
            return customers[index];
        } else {
            return null;
        }
    }

}

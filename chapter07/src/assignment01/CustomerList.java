/*package assignment01;

public class CustomerList {
    private Customer[] customers;
    private int total = 0;

    public CustomerList(int totalCustomer) {
        String[] customers = new String[totalCustomer];
    }

    public boolean addCustomer(Customer customer) {
        if (total < customers.length) {
            total++;
            return true;
        } else {
            return false;
        }

    }

    public boolean replaceCustomer(int index, Customer cust) {
        if (customers.length > index && index > 0) {
            customers[index - 1] = cust;
            return true;
        } else {
            return false;
        }
    }

    public boolean deleteCustomer(int index) {
        if (customers.length > index && index > 0){
            for (int i=index;i<CustomerList)
            customers[index-1]=customers[index];
        }
    }

    public Customer[] getAllCustomers() {

    }*//*


    public Customer getCustomer(int index) {
        return customers[index - 1];
    }

    public int getTotal() {
        return total;
    }


}
*/

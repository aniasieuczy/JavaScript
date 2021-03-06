import java.util.ArrayList;
import java.util.Scanner;

public class Branch {

    private String branch;
    private ArrayList<Customer> customers;

    public Branch(String branch) {
        this.branch = branch;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return branch;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean addANewCustomer (String customerName, double initialAmount) {
        if(findCustomer(customerName) == null) {
            this.customers.add(new Customer(customerName, initialAmount));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction (String customerName, double amount) {
        Customer existingCustomer = findCustomer(customerName);

        if((existingCustomer) != null) {
        existingCustomer.addTransaction(amount);
        return true;
        }
        return false;
    }

    private Customer findCustomer (String customerName) {
        for (int i = 0; i < this.customers.size(); i++) {
            Customer checkedCustomer = this.customers.get(i);
            if (checkedCustomer.getName().equals(customerName)) {
                return checkedCustomer;
            }
        }
        return null;
    }






}

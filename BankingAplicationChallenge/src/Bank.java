import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> listOfBranches;

    public Bank(String customerName) {
        this.name = customerName;
        this.listOfBranches = new ArrayList<Branch>();
    }


    public boolean addBranch(String branchName) {
        if (findBranch(name) == null) {
            this.listOfBranches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addANewCustomer(customerName, initialAmount);
        }
        return false;
    }

    public boolean addCustomerTransactions (String branchName, String customerName, double amount) {
     Branch branch = findBranch(branchName);
         if (branch != null) {
             return branch.addCustomerTransaction(customerName, amount);
         }
         return false;
        }


    private Branch findBranch (String branchName) {
        for(int i = 0; i< listOfBranches.size(); i++) {
            if (this.listOfBranches.get(i).getName().equals(branchName)) {
                return this.listOfBranches.get(i);
            }
        }
        return null;
    }


    public boolean listCustomers (String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customer details for branch " + branch.getName());

            ArrayList <Customer> branchCustomers = branch.getCustomers();
            for(int i = 0; i < branchCustomers.size(); i++) {
                System.out.println("Customer " + branchCustomers.get(i).getName() + "[" + (i +1) + "]");

                if(showTransactions) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomers.get(i).getTransactions();
                    for(int j = 0; j<transactions.size(); j++) {
                        System.out.println("[" + (j+1) + "] Amount " + transactions.get(j));
                    }
                }
            }
            return true;
            } else {
            return false;
        }
    }







}

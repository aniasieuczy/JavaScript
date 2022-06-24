public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("National Australia Bank");
        bank.addBranch("Adelaide");
        bank.addCustomer("Adelaide", "Ania", 50.05);
        bank.addCustomer("Adelaide", "Tymon", 175.34);
        bank.addCustomer("Adelaide", "Nikodem", 220.12);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "Bob", 150.54);

        bank.addCustomerTransactions("Adelaide", "Ania", 44.22);
        bank.addCustomerTransactions("Adelaide", "Ania", 12.44);
        bank.addCustomerTransactions("Adelaide", "Tymon", 1.65);

        bank.listCustomers("Adelaide", true);
        bank.listCustomers("Sydney", true);

        bank.addBranch("Melbourne");

        if(!bank.addCustomer("Melbourne", "Brian", 5.53)) {
            System.out.println("Error Melbourne branch does not exist");
        }

//        if(!bank.addBranch("Adelaide")) {
//            System.out.println("Adelaide branch already exists");
//        }

        if(!bank.addCustomerTransactions("Adelaide", "Fergus", 52.33)) {
            System.out.println("Customer does not exist at branch");
        }

        if(!bank.addCustomer("Adelaide", "Ania", 12.21)) {
            System.out.println("Customer Ania already exists");
        }

    }
}

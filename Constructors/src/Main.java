public class Main {
    public static void main(String[] args) {

//        BankAccount bankAccount = new BankAccount(); //"12345", 0.00, "Anna Szpecht", "660_480_560", "szpecht.anna@gmail.com");

//        System.out.println(bankAccount.getBalance());
//        System.out.println(bankAccount.getCustomerName());

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Anna Szpecht", 25000.00);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Tymon", 100.00, "tymon@gmail.com");
        System.out.println(person3.getName());

//        bankAccount.setCustomerName("Anna Szpecht");
//        System.out.println("Customer name is " + bankAccount.getCustomerName());
//
//        bankAccount.setCustomerEmailAddress("szpecht.anna@gmail.com");
//        System.out.println("Customer email address is " + bankAccount.getCustomerEmailAddress());
//
//        bankAccount.setPhoneNumber("660 480 560");
//        System.out.println("Customer phone number is " + bankAccount.getPhoneNumber());
//
//        bankAccount.setBankAccountNumber("123456789");
//       System.out.println("Customer bank account number is " + bankAccount.getBankAccountNumber());
//
//        bankAccount.withdrawal(100.0);
//
//        bankAccount.depositFunds(50);
//        bankAccount.withdrawal(100);
//
//        bankAccount.depositFunds(51);
//        bankAccount.withdrawal(100);









    }
}

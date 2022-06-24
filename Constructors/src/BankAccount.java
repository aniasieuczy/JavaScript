public class BankAccount {

    private String bankAccountNumber;
    private double balance;
    private String customerName;
    private String phoneNumber;
    private String customerEmailAddress;

    public BankAccount () {
        this("12345", 0.00, "Anna Szpecht", "660480560", "szpecht.anna@gmail.com");
        System.out.println("Empty constructor called");
    }

    public BankAccount (String bankAccountNumber, double balance, String customerName, String phoneNumber, String customerEmailAddress) {
        System.out.println("Account constructor with parameters called");
    this.bankAccountNumber = bankAccountNumber;
    this.balance = balance;
    this. customerName = customerName;
    this. phoneNumber = phoneNumber;
    this. customerEmailAddress = customerEmailAddress;
    }

    public String getBankAccountNumber () {
        return this.bankAccountNumber;
    }

    public void setBankAccountNumber (String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public double getBalance () {
        return this.balance;
    }

    public void setBalance (double balance) {
        this.balance = balance;
    }

    public String getCustomerName () {
        return this.customerName = customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhoneNumber () {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerEmailAddress () {
        return this.customerEmailAddress;
    }

    public void setCustomerEmailAddress (String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public void depositFunds (double depositAmount) {
        this.balance = balance + depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }

    public void withdrawal (double withdrawalAmount) {

        if (this.balance < withdrawalAmount) {
            System.out.println("Insufficient funds. Withdrawal is not possible. Current balance is " + this.balance);
        } else {
            this.balance = balance - withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance = " + this.balance);
        }
    }


    }




package inheritance;

// constructors lecture
public class BankAccount {

    private String number;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(String accountNumber, double initialBalance, String name, String email, String phoneNumber) {
        this.number = accountNumber;
        this.balance = initialBalance;
        this.customerName = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount() {
        this("00000", 0.00, "Default Name", "Default address", "7780000000");
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("0000", 00.00, customerName, email, phoneNumber);
    }


    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        double newBalance = this.balance - amount;
        if (newBalance < 0) {
            // throw error
            System.out.println("You do not have enough money to withdraw, the amount: " + this.balance);
        } else {
            this.balance = newBalance;
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return number;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(String number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}


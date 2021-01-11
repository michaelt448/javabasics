package builtins.challenge.banking;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("BMO");
        bank.addBranch("Vancouver");

        bank.addCustomer("Vancouver", "Jack", 0.0);
        bank.addCustomer("Vancouver", "Michael", 1.0);
        bank.addCustomer("Vancouver", "Richard", 10.0);

        bank.addCustomerTransaction("Vancouver", "Michael", 100.0);
        bank.listCustomers("Vancouver", true);
    }
}

package builtins.challenge.banking;

import java.util.ArrayList;

public class Branch {

    private String name;
    ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public boolean newCustomer(String name, double initAmount) {
        Customer existingCustomer = findCustomer(name);
        if (existingCustomer != null) {
            System.out.println("Already found customer name in branch");
            return false;
        } else {
            this.customers.add(new Customer(name, initAmount));
            return true;
        }
    }

    private Customer findCustomer(String customerName) {
        for (Customer customer: this.customers) {
            if (customer.getName().equals(customerName)) return customer;
        }

        return null;
    }

    public boolean addCustomerTransaction(String name, double transaction) {
        Customer customer = findCustomer(name);
        if (customer != null) {
            customer.addTransaction(transaction);
            return true;
        } else {
            System.out.println("Could not find customer in the branch");
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

}

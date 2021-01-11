package builtins.challenge.banking;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branches;
    private String name;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String branchName) {
        Branch currBranch = findBranch(branchName);
        if (currBranch != null) {
            return false;
        } else {
            this.branches.add(new Branch(branchName));
            return true;
        }
    }

    public boolean addCustomer(String branchName, String customerName, double initAmount) {
        Branch currBranch = findBranch(branchName);
        if (currBranch != null) {
            boolean success = currBranch.newCustomer(customerName, initAmount);
            return success;
        } else {
            return false;
        }
    }

    public boolean addCustomerTransaction(String branchName, String customer, double transaction) {
        Branch currBranch = findBranch(branchName);
        if (currBranch != null) {
            boolean success = currBranch.addCustomerTransaction(customer, transaction);
            return true;
        } else {
            return false;
        }
    }

    public boolean listCustomers(String branchName, boolean printTransactions) {
        System.out.println("Customer details for branch " + branchName);
        Branch currBranch = findBranch(branchName);
        if (currBranch != null) {
            ArrayList<Customer> customers = currBranch.getCustomers();
            for(Customer customer: customers) {
                System.out.println("Customer " + customer.getName() + "[" + customers.indexOf(customer) + "]");
                if (printTransactions) {
                    ArrayList<Double> transactions = customer.getTransactions();
                    for (double transaction: transactions) {
                        System.out.println("Transactions");
                        System.out.println("[" + (transactions.indexOf(transaction) + 1) + "]" + " Amount " + transaction);
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }

    private Branch findBranch(String branchName) {
        for(Branch branch: this.branches) {
            if (branch.getName().equals(branchName)) return branch;
        }

        return null;
    }

}

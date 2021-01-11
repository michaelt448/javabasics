package builtins.challenge.banking;

import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name) {
        this(name, 0.0);
    }

    public Customer(String name, double initAmount) {
        this.name = name;
        this.transactions = new ArrayList<>();
        this.transactions.add(initAmount);
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double transaction) {
        this.transactions.add(transaction);
    }

    public String getName() {
        return name;
    }
}

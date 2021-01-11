package builtins.lectures.linkedlists;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Tim", 5300);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(89);
        System.out.println("This is the name " + anotherCustomer.getName() + "and this is the baalance" + anotherCustomer.getBalance());

        ArrayList<Integer> initList = new ArrayList<>();

        initList.add(1);
        initList.add(2);
        initList.add(3);

        for (int value: initList) {
            System.out.println(value);
        }

        initList.add(1,2);

        for (int value: initList) {
            System.out.println(value);
        }

        // linked lists are better when it comes to inserting and deleting elements from middle of the list over array
        //linked lists iterates through the list and instead of being indexed
    }
}

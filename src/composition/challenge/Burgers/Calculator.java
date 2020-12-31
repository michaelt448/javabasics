package composition.challenge.Burgers;

import composition.challenge.Burgers.Topings.Toping;

import java.util.ArrayList;

public class Calculator {

    public static double calculateTotal(Burger burger) {
        double basePrice = burger.getBASE_PRICE();
        ArrayList<Toping> toppings = burger.getToppingsAdder().getTopings();
        double total = basePrice;

        for (Toping curr: toppings) {
            total += curr.getPrice();
        }
       return total;
    }

    public static String printCurentReciept(Burger burger) {
        double basePrice = burger.getBASE_PRICE();
        ArrayList<Toping> toppings = burger.getToppingsAdder().getTopings();

        String nextLine = "\n";
        String reciept = "Base Price: " + basePrice + nextLine;

        for (Toping curr: toppings) {
            String toppingString = curr.getName();
            double currPrice = curr.getPrice();
            reciept += toppingString + ": " + currPrice + nextLine;
        }

        double total = calculateTotal(burger);
        reciept += "Total Price: " + total;

        return reciept;
    }



}

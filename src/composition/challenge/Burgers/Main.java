package composition.challenge.Burgers;

import composition.challenge.Burgers.Topings.*;

public class Main {

    public static void main(String[] args) {
        Burger myBurger = new Burger("bread", "beef");
        print(myBurger.getBreadType());
        print(myBurger.getMeatType());
        print(myBurger.getName());
        myBurger.setName("Michael's Burger");
        print(myBurger.getName());
        print(myBurger.getTotalPrice());
        print(myBurger.getCurrentRecipt());

        Toping cheese = new Cheese();
        Toping lettuce = new Lettuce();
        Toping bacon = new Bacon();
        Toping mayo = new Mayo();
        Toping fries = new Fries();
        myBurger.addToping(cheese);
        myBurger.addToping((lettuce));
        print(myBurger.getCurrentRecipt());
        myBurger.addToping(bacon);
        myBurger.addToping(mayo);
        print(myBurger.getCurrentRecipt());
        myBurger.addToping(fries);
        print(myBurger.getCurrentRecipt());
    }

    private static void print(String message) {
        System.out.println(message);
    }
}

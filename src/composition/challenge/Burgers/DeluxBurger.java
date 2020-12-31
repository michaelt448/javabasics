package composition.challenge.Burgers;

import composition.challenge.Burgers.Topings.Drink;
import composition.challenge.Burgers.Topings.Fries;

public class DeluxBurger extends Burger{
    public DeluxBurger(String meatType, String breadType, String name) {
        super(2, meatType, breadType, name);
        addToping(new Fries());
        addToping(new Drink());
    }
}

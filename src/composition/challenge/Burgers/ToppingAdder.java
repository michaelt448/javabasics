package composition.challenge.Burgers;

import composition.challenge.Burgers.Topings.Toping;

import java.util.ArrayList;

public class ToppingAdder {
    private int maxToppings;
    private ArrayList<Toping> topings;

    public ToppingAdder(int maxToppings) {
        this.maxToppings = maxToppings;
        this.topings = new ArrayList<>();
    }

    public int getMaxToppings() {
        return maxToppings;
    }

    public ArrayList<Toping> getTopings() {
        return topings;
    }

    public void AddTopping(Toping newToping) {
        if (this.topings.size() < maxToppings) {
            this.topings.add(newToping);
        } else {
            System.out.println("Can't add anymore topings");
        }
    }
}

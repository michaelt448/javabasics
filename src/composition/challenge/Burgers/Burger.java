package composition.challenge.Burgers;

import composition.challenge.Burgers.Topings.Toping;

public class Burger {
    private ToppingAdder toppingsAdder;
    private String meatType;
    private String breadType;
    private String name;
    private final double BASE_PRICE = 5;

    public Burger(String meatType, String breadType) {
        this(meatType, breadType, null);
    }

    public Burger(String meatType, String breadType, String name) {
        this(4, meatType, breadType, name);
    }

    public Burger(int maxToppings, String meatType, String breadType, String name) {
        this.toppingsAdder = new ToppingAdder(maxToppings);
        this.meatType = meatType;
        this.breadType = breadType;
        this.name = name;
    }

    public void addToping(Toping toping) {
        this.toppingsAdder.AddTopping(toping);
    }

    public String getTotalPrice() {
        return Double.toString(Calculator.calculateTotal(this));
    }

    public String getCurrentRecipt() {
        return Calculator.printCurentReciept(this);
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBASE_PRICE() {
        return BASE_PRICE;
    }

    public String getMeatType() {
        return meatType;
    }

    public ToppingAdder getToppingsAdder() {
        return toppingsAdder;
    }

    public String getBreadType() {
        return breadType;
    }

    public String getName() {
        if (name != null) {
            return name;
        } else {
            return "Please insert a name";
        }
    }
}

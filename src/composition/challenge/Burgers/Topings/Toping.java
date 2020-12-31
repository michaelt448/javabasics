package composition.challenge.Burgers.Topings;

public class Toping {
    private double price;
    private String name;

    protected Toping(double price, String name) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}

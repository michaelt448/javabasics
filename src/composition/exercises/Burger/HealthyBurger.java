package composition.exercises.Burger;

public class HealthyBurger extends Hamburger{
    private double healthyExtra1Price;
    private String healthyExtra1Name;

    private double healthyExtra2Price;
    private String healthyExtra2Name;

    public HealthyBurger(String meat, double price) {
        super("Healthy burger", meat, price, "whole wheat");
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double total =  super.itemizeHamburger();
        if (this.healthyExtra1Name != null) {
            total += this.healthyExtra1Price;
        }
        if (this.healthyExtra2Name != null) {
            total += this.healthyExtra2Price;
        }
        return total;
    }
}

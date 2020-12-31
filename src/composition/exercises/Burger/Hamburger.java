package composition.exercises.Burger;

public class Hamburger {
    private String name;
    private String meat;
    private String breadRollType;
    private double price;

    private double addition1Price;
    private String addition1Name;

    private double addition2Price;
    private String addition2Name;

    private double addition3Price;
    private String addition3Name;

    private double addition4Price;
    private String addition4Name;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
    }

    public void addHamburgerAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger() {
        double total = this.price;
        if (this.addition1Name != null) {
            total += this.addition1Price;
        }
        if (this.addition2Name != null) {
            total += this.addition2Price;
        }
        if (this.addition3Name != null) {
            total += this.addition3Price;
        }
        if (this.addition4Name != null) {
            total += this.addition4Price;
        }

        return  total;
    }
}

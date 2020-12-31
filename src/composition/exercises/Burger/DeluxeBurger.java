package composition.exercises.Burger;

public class DeluxeBurger extends Hamburger{
    public DeluxeBurger() {
        super("Delux", "Beef", 10, "Bread");
        super.addHamburgerAddition1("Chips", 9);
        super.addHamburgerAddition2("Drink", .1);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Not allowed to add stuff");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Not allowed to add stuff");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Not allowed to add stuff");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Not allowed to add stuff");
    }
}

package inheritance;

public class Fish extends Animal{
    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest() {
        System.out.println("Swimming");
    }

    private void moveMuscels() {
        System.out.println("moving muscels");
    }

    private void moveBackFin() {
        System.out.println("Moving back fin");
    }

    private void swim() {
        System.out.println("swimming");
    }

    @Override
    public void move(int speed) {
        moveBackFin();
        moveMuscels();
        swim();
        super.move(speed);
    }
}

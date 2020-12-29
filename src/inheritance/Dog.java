package inheritance;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.coat = coat;
        this.teeth = teeth;
        this.tail = tail;
    }

    private void chew() {
        System.out.println("chewing");
    }

    @Override
    public void eat() {
        chew();
        super.eat();
    }

    private void moveLegs() {
        System.out.println("Moving legs");
    }

    @Override
    public void move(int speed) {
        moveLegs();
        super.move(speed);
    }

    public void walk()  {
        System.out.println("walking");
        move(5);
    }

    public void run() {
        System.out.println("running");
        move(10);
    }
}

package composition.exercises.polymorphism;

public class Holden extends Car{
    public Holden(int cylinder, String name) {
        super(cylinder, name);
    }

    @Override
    public String startEngine() {
        return "Holden Starting Engine";
    }

    @Override
    public String brake() {
        return "Holden Braking";
    }

    @Override
    public String accelerate() {
        return "Holden braking";
    }
}

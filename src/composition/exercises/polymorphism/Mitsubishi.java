package composition.exercises.polymorphism;

public class Mitsubishi extends Car{
    public Mitsubishi(int cylinder, String name) {
        super(cylinder, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi Starting Engine";
    }

    @Override
    public String brake() {
        return "Mitsubishi Braking";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi braking";
    }
}

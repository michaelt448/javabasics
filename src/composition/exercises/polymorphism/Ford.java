package composition.exercises.polymorphism;

public class Ford extends Car{
    public Ford(int cylinder, String name) {
        super(cylinder, name);
    }

    @Override
    public String startEngine() {
        return "Ford Starting Engine";
    }

    @Override
    public String brake() {
        return "Ford Braking";
    }

    @Override
    public String accelerate() {
        return "Ford braking";
    }
}

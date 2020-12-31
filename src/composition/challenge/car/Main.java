package composition.challenge.car;

class Car {
    private String engine;
    private int cylinder;
    private int wheels;

    public Car(String engine, int cylinder, int wheels) {
        this.engine = engine;
        this.cylinder = cylinder;
        this.wheels = wheels;
    }

    public void startEngine() {
        System.out.println("Started engine" + this.engine);
    }

    public void stopEngine() {
        System.out.println("Stopped engine" + this.engine);
    }

    public void brake() {
        System.out.println("Braking the car");
    }

    public String getEngine() {
        return engine;
    }

    public int getCylinder() {
        return cylinder;
    }

    public int getWheels() {
        return wheels;
    }
}

class Honda extends Car {
    public Honda(int cylinder, int wheels) {
        super("Honda Engine", cylinder, wheels);
    }

    @Override
    public void brake() {
        System.out.println("Braking my awesome honda");
    }
}

class Mercedes extends Car {
    public Mercedes(int cylinder, int wheels) {
        super("Mercedes Engine", cylinder, wheels);
    }

    @Override
    public void brake() {
        System.out.println("Breaking my awesome mercedes");
    }
}

public class Main {

    public static void main(String[] args) {
        Car mercedes = new Mercedes(4,4);
        Car honda = new Honda(2,4);

        mercedes.brake();
        honda.brake();
        mercedes.startEngine();
        honda.startEngine();
    }
}

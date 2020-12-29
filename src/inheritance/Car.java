package inheritance;

// basic classes lecture
public class Car {

    private int doors;
    private int wheels;
    private String engine;
    private String model;
    private String colour;

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel() {
        return this.model;
    }
}

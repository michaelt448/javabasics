package inheritance.exercises.carpetcalculator;

public class Floor {
    private double width;
    private double length;

    public Floor(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getArea() {
        return this.length * this.width;
    }
}

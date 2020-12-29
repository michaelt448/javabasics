package inheritance.exercises.pool;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        double validWith = width < 0 ? 0 : width;
        double validLength = length < 0 ? 0 : length;
        this.width = validWith;
        this.length = validLength;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return this.length * this.width;
    }
}

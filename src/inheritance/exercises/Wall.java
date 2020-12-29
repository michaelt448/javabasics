package inheritance.exercises;

public class Wall {
    private double height;
    private double width;

    public Wall() {
        this(0, 0);
    }

    public Wall(double width, double height) {
        setHeight(height);
        setWidth(width);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height < 0 ? 0 : height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width < 0 ? 0 : width;
    }

    public double getArea() {
        return this.height * this.width;
    }
}

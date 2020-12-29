package inheritance.exercises;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this(0,0);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        int pt1X = this.getX();
        int pt1Y = this.getY();

       return Math.sqrt(Math.pow(pt1X, 2) + Math.pow(pt1Y, 2));
    }

    public double distance(int x, int y) {
        int pt1X = this.getX();
        int pt1Y = this.getY();


        return Math.sqrt(Math.pow(pt1X - x, 2) + Math.pow(pt1Y - y, 2));
    }

    public double distance(Point otherPoint) {
        int pt1X = this.getX();
        int pt1Y = this.getY();
        int pt2X = otherPoint.getX();
        int pt2Y = otherPoint.getY();

        return Math.sqrt(Math.pow(pt1X - pt2X, 2) + Math.pow(pt1Y - pt2Y, 2));
    }
}

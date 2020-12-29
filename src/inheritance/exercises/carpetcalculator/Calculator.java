package inheritance.exercises.carpetcalculator;

public class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
        double carpetCost = this.carpet.getCost();
        double area = this.floor.getArea();

        return area * carpetCost;
    }
}

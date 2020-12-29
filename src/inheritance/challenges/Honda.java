package inheritance.challenges;

public class Honda extends Car {
    private int roadServiceMonths;

    public Honda(int roadServiceMonths) {
        super("Honda", "4WD", 5, 4, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelarate(int rate) {
        int newVelocity = getSpeed() + rate;
        setSpeed(newVelocity);
        if (newVelocity == 0) {
            stop();
            changeGear(0);
        } else if (newVelocity >= 0 && newVelocity <= 10){
            changeGear(1);
        } else if (newVelocity >= 10 && newVelocity <= 20){
            changeGear(2);
        } else if (newVelocity >= 20 && newVelocity <= 30){
            changeGear(3);
        } else if (newVelocity >= 30 && newVelocity <= 40){
            changeGear(4);
        } else if (newVelocity >= 40 && newVelocity <= 50){
            changeGear(5);
        } else {
            changeGear(6);
        }

        if (newVelocity > 0 ) {
            changeVelocity(newVelocity, getDirection());
        }
    }
}

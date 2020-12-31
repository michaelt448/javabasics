package composition.challenge.room;

public class Lights {
    private boolean lightsOn;

    public Lights() {
        this(false);
    }

    public Lights(boolean lightsOn) {
        this.lightsOn = lightsOn;
    }

    public void switchLights() {
        this.lightsOn = !this.lightsOn;
        System.out.println("Switched light to" + this.lightsOn);
    }
}

package composition.challenge.room;

public class Room {

    private Lights lights;
    private Couch couch;

    public Room(Lights lights, Couch couch) {
        this.lights = lights;
        this.couch = couch;
    }

    public Couch getCouch() {
        return couch;
    }

    public void switchLights () {
        this.lights.switchLights();
    }
}

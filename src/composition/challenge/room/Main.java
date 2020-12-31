package composition.challenge.room;

public class Main {

    public static void main(String[] args) {
        Couch newCouch = new Couch(4);
        Lights newLights = new Lights();
        Room room = new Room(newLights, newCouch);

        room.getCouch().sitOne();
        room.switchLights();
    }

}

package composition.challenge.room;

public class Couch {
    private int maxOccupancy;
    private int curentOccupancy;

    public Couch(int maxOccupancy) {
        this(maxOccupancy, 0);
    }

    private Couch(int maxOccupancy, int curentOccupancy) {
        this.maxOccupancy = maxOccupancy;
        this.curentOccupancy = curentOccupancy;
    }

    public void sitOne() {
        int totalAmount = this.curentOccupancy + 1;
        if (totalAmount < maxOccupancy) {
            this.curentOccupancy = totalAmount;
            System.out.println("One person successfully sat");
        } else {
            System.out.println("Full amount reached ! cannot sit anymore people.");
        }
    }
}

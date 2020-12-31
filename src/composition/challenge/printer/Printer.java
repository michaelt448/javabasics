package composition.challenge.printer;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(boolean duplex) {
        this(0, 0, duplex);
    }

    private Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    public void fillUpToner(int toner) {
        if (toner < 0) System.out.println("Invalid toner put in");
        int totalToner = toner + this.tonerLevel;
        this.tonerLevel = Math.min(this.tonerLevel, 100);
    }

    public void print(int pages) {
        if (pages < 1) System.out.println("Invalid pages amount");
        if (duplex) {
            this.pagesPrinted = pages/2 + pages % 2 + this.pagesPrinted;
        } else {
            this.pagesPrinted = pages + this.pagesPrinted;
        }
        System.out.println("Printed a page total of " + this.pagesPrinted);
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}

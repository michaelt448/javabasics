package composition.exercises.Encapsulation;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel < 0 || tonerLevel > 100) {
            this.tonerLevel = -1;
        } else {
            this.tonerLevel = tonerLevel;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        int totalToner = tonerAmount + this.tonerLevel;

        if (totalToner > 100 || this.tonerLevel <= 0 || tonerAmount <= 0) {
            return -1;
        } else {
            this.tonerLevel = totalToner;
            return this.tonerLevel;
        }
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (duplex) {
            pagesToPrint = pages/2 + pages%2;
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}

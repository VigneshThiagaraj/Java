public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel>=0 && tonerLevel <=100) ? tonerLevel : 0;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int  addToner(int tonerAmount){
        if (tonerAmount>0 && tonerAmount<=100) {
            return (tonerLevel + tonerAmount > 100) ? -1 : (tonerLevel += tonerAmount);
        }
        return -1;
    }

    public int  printPages(int pages) {
        int pagesToPrint = pages;
        pagesToPrint = (this.duplex) ? (int) Math.round((double) pagesToPrint/2) : pages;
        this.pagesPrinted = getPagesPrinted() + pagesToPrint;
        return pagesToPrint;
    }

    public int  getPagesPrinted() {
        return this.pagesPrinted;
    }
}

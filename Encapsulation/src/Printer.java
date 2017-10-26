public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplex;
    private String manufacturer;

    public Printer(boolean isDuplex, String manufacturer) {
        this.tonerLevel = 100;
        this.pagesPrinted = 0;
        this.isDuplex = isDuplex;
        this.manufacturer = manufacturer;
    }

    public void fillToner(int level){
        if ((this.tonerLevel +=  level) >= 100) {
            this.tonerLevel = 100;
            System.out.println("Your toner is FULL now");
        } else {
            this.tonerLevel += level;
        }
    }

    public int printPage (int pages) {
        System.out.println("Printing " + pages + " pages...");
        int count = 1;
        do {
            if (this.tonerLevel < 10 && this.tonerLevel > 5){
                System.out.println("Toner level low!!!! Please refill...");
                this.pagesPrinted ++;
                this.tonerLevel -= 1;
                count++;
                System.out.println("Pages printed: " + this.pagesPrinted);
            } else if (this.tonerLevel<= 5){
                System.out.println("Print aborted!!! Low toner level!!!");
                return 0;
            } else {
                this.pagesPrinted ++;
                this.tonerLevel -= 1;
                count++;
                System.out.println("Pages printed: " + this.pagesPrinted);
            }
        } while (count <= pages);
        return 1;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

}

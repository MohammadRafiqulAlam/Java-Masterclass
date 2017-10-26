public class Main {
    // Encapsulation reserves the fields within a class to be modified within that class only
    // The fields can be accesses from outside by other class objects using setters and getters,
    // In this was the field names can be completely hidden to external class objects
    // The use of private variables and constructor are examples of encapsulation
    // External class can updated values by using public methods
    // In other words, encapsulation creates a black box, the content of which can only be changed from within
    // ------------------------------ CHALLENGE ----------------------------------------------
    // Create a class and demonstrate proper encapsulation techniques
    // the class will be called Printer
    // It will simulate a real Computer Printer
    // It should have fields for the toner Level, number of pages printed, and
    // also whether its a duplex printer (capable of printing on both sides of the paper).
    // Add methods to fill up the toner (up to a maximum of 100%), another method to
    // simulate printing a page (which should increase the number of pages printed).
    // Decide on the scope, whether to use constructors, and anything else you think is needed.
    public static  void main(String[] args){

        Printer printer = new Printer(true,"Cannon");
        int pagesToBePrinted = 150;
        if (printer.printPage(pagesToBePrinted) == 0) {
            printer.fillToner(100);
            printer.printPage(pagesToBePrinted-printer.getPagesPrinted());
        }

        System.out.println("Toner level: " + printer.getTonerLevel());
        System.out.println("Pages printed: " + printer.getPagesPrinted());

    }
}

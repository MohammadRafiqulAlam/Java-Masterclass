public class Main {
    public static   void main(String[] args){

        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220B","Dell","240",dimensions);
        Monitor monitor = new Monitor("27 Inch", "Acer",27,new Resolution(2540,1440));
        Motherboard themotherBoard = new Motherboard("1234","Intel",2,4,"2.3" );
        // The PC is composed of case, monitor and mother board
        PC thePC =new PC(theCase,monitor,themotherBoard);
        thePC.getMonitor().drawPixelAt(100,200,"Red");
        thePC.getMotherboard().loadProgram("Windows 7");
    }
}

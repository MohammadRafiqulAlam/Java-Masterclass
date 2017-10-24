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

        // ---------- CHALLENGE------------------
        // Create a single room of a house using composition.
        // Think about the things that should be included in the room.
        // Maybe physical parts of the house but furniture as well
        // Add at least one method to access an object via a getter and
        // then that objects public method as you saw in the previous video
        // then add at least one method to hide the object e.g. not using a getter
        // but to access the object used in composition within the main class
        // like you saw in this video.

    }
}

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
        // then access an object using public method
        // then add at least one method to hide the object e.g. not using a getter
        // but to access the object used in composition within the main class
        System.out.println("-------------CHALLENGE --------------");
        //Length of the room
        Positioning surfacePositioning1 = new Positioning(25,"Vertical","T");
        Surface surface1 = new Surface(5,3,surfacePositioning1);

        //width of the room
        Positioning surfacePositioning2 = new Positioning(115,"Vertical","N");
        Surface surface2 = new Surface(3,3,surfacePositioning2);

        //floor and ceiling
        Positioning surfacePositioning3 = new Positioning(0,"Horizontal","N");
        Surface surface3 = new Surface(5,3,surfacePositioning3);

        Furniture furniture = new Furniture("Couch",4,"Black");

        Room room1 = new Room(surface1,surface2,surface3,furniture);

        // Add at least one method to access an object via a getter and then access an object using public method
        room1.getSurface1().returnDimensions();

        // Add at least one method to hide the object e.g. not using a getter
        // but to access the object used in composition within the main class
        Opening opening = new Opening(2,1,2,"Window","Glass");
        room1.getSurface1().surfaceOpening(opening);
    }
}

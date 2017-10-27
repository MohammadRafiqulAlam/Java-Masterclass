class Movie{
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public void highlight(){
        System.out.println("No highlights available");
    }
}

class Money extends Movie {
    public Money(String name) {
        super(name);
    }

    @Override
    public void highlight() {
        System.out.println("Two friends who take money for passing critical " +
                    "information of their company are chased by another person and one of the friends' wife");
    }
}

class OtherLife extends Movie {
    public OtherLife(String name) {
        super(name);
    }

    @Override
    public void highlight() {
        System.out.println("A highly talented programmer develops a biological software " +
                "that can simulate real life feelings after an eye-drop is applied");
    }
}

class Nothing extends Movie {
    public Nothing(String name) {
        super(name);
    }

}

public class Main {
    // Polymorphism automatically assigns unique functionality (e.g., overrides methods)
    // to a number of classes inherited from a bases class
    public static void main(String[] args){
        System.out.println("Movie 1");
        Money money = new Money("Money");
        money.highlight(); // Polymorphism allows automatically uses the highlights method in Money class
        System.out.println("_____________________________");
        System.out.println("Movie 2");
        OtherLife otherlife = new OtherLife("OtherLife");
        otherlife.highlight(); // Polymorphism allows automatically uses the highlights method in OtherLife class
        System.out.println("_____________________________");
        System.out.println("Movie 3");
        Nothing nothing = new Nothing("No movie");
        nothing.highlight(); // There is no native highlights function in Nothing class. Polymorphism automatically
        // allows the highlights method in super class Movie.

    }
}

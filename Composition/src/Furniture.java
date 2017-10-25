public class Furniture {
    private String name;
    private int legs;
    private String color;

    public Furniture(String name, int legs, String color) {
        this.name = name;
        this.legs = legs;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getLegs() {
        return legs;
    }

    public String getColor() {
        return color;
    }
}

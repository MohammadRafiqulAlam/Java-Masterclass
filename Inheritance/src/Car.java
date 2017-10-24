/**
 * Created by MR ALAM on 6/29/2017.
 */
public class Car extends Vehicle{
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currGear;

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currGear = 1;
    }

    public void changeGear(int currGear) {
        this.currGear = currGear;
        System.out.println("Car.setCurrentGear(): Change to " + this.currGear + " gear.");
    }

    public void changevelocity(int speed, int direction){
        System.out.println("Car.chageVelocity() : Velocity " + speed +  " direction " + direction + "degrees.");
        move(speed, direction);
    }
}
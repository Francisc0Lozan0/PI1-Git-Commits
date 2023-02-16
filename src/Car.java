public class Car {

    private boolean wheels;
    private int cylinders;

    public Car(boolean wheels, int cylinders) {
        this.wheels = wheels;
        this.cylinders = cylinders;
    }       retu    }

    public void setWheels(boolean wheels) {
        this.wheels = wheels;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public String toString() {
        return "Wheels: " + wheels + " cylinders: " + cylinders + "\n";
    }
}

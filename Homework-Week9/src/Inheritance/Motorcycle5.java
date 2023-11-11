package Inheritance;

public class Motorcycle5 extends Vehicle5 {

    private double fuelEfficiency;
    private double distanceTraveled;
    private double maximumSpeed;


    public Motorcycle5(String make, String model, int year, String fuelType, double fuelEfficiency) {
        super(make, model, year, fuelType, fuelEfficiency);

        this.fuelEfficiency = fuelEfficiency;
        this.distanceTraveled = distanceTraveled;
        this.maximumSpeed = maximumSpeed;

    }
    public double getFuelEfficiency() {
        return fuelEfficiency;
    }


    public double getDistanceTraveled() {
        return distanceTraveled;
    }


    public double getMaximumSpeed() {
        return maximumSpeed;
    }
}








package Inheritance;

public class Truck5 extends Vehicle5 {

    private double fuelEfficiency;
    private double distanceTraveled;
    private double maximumSpeed;


    public Truck5(String make, String model, int year, String fuelType, double fuelefficiency) {
        super(make, model, year, fuelType, fuelefficiency);

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








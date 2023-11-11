package Inheritance;

public class Car5 extends Vehicle5 {


    private double fuelEfficiency;
    private double distanceTraveled;
    private double maximumSpeed;

    public Car5(String make, String model, int year, String fuelType, double fuelEfficiency) {
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


    public static void main(String[] args) {

        Truck5 truck = new Truck5("Ford", "F-150", 2022, "Diesel", 13.8);
        System.out.println("Make: " + truck.getMake());
        System.out.println("Model: " + truck.getModel());
        System.out.println("Year: " + truck.getYear());
        System.out.println("Fuel Type: " + truck.getFuelType());
        System.out.println("Fuel Efficiency: " + truck.getFuelEfficiency() + " miles per gallon");
        System.out.println("Distance Traveled: " + truck.getDistanceTraveled() + " miles");
        System.out.println("Maximum Speed: " + truck.getMaximumSpeed() + " miles per hour");


        Motorcycle5 motorcycle = new Motorcycle5("YAMAHA", "YZ450F", 2017, "Petrol", 25.5);
        System.out.println("Make: " + truck.getMake());
        System.out.println("Model: " + truck.getModel());
        System.out.println("Year: " + truck.getYear());
        System.out.println("Fuel Type: " + truck.getFuelType());
        System.out.println("Fuel Efficiency: " + truck.getFuelEfficiency() + " miles per gallon");
        System.out.println("Distance Traveled: " + truck.getDistanceTraveled() + " miles");
        System.out.println("Maximum Speed: " + truck.getMaximumSpeed() + " miles per hour");


        Car5 car = new Car5("LEXUS", "CT200H", 2022, "Petrol", 45.6);
        System.out.println("Make: " + truck.getMake());
        System.out.println("Model: " + truck.getModel());
        System.out.println("Year: " + truck.getYear());
        System.out.println("Fuel Type: " + truck.getFuelType());
        System.out.println("Fuel Efficiency: " + truck.getFuelEfficiency() + " miles per gallon");
        System.out.println("Distance Traveled: " + truck.getDistanceTraveled() + " miles");
        System.out.println("Maximum Speed: " + truck.getMaximumSpeed() + " miles per hour");



    }

    }



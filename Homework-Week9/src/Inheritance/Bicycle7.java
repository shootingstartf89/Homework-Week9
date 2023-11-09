/* Write a Java program to create a class Vehicle with a method called speedUp(). Create
two subclasses Car and Bicycle. Override the speedUp() method in each subclass to
increase the vehicle's speed differently.*/

package Inheritance;

public class Bicycle7 extends Vehicle7 {

    public void speedUp() { //override speedUp() method
        super.speedUp();
        System.out.println("Bicycle speed increased by 10 units");
}

        public static void main(String[] args) {
        Car7 car = new Car7();
        Bicycle7 bicycle = new Bicycle7();
        System.out.println("Car initial speed: " + car.getSpeed());
        System.out.println("Motorcycle initial speed: " + bicycle.getSpeed());
        car.speedUp();
        bicycle.speedUp();
        System.out.println("Car speed after speeding up: " + car.getSpeed());
        System.out.println("Motorcycle speed after speeding up: " + bicycle.getSpeed());
    }
    }


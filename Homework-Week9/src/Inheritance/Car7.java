/* Write a Java program to create a class Vehicle with a method called speedUp(). Create
two subclasses Car and Bicycle. Override the speedUp() method in each subclass to
increase the vehicle's speed differently.*/

package Inheritance;

public class Car7 extends Vehicle7 {

    public void speedUp() { //override speedUp() method
        super.speedUp();
        System.out.println("Car speed increased by 50 miles.");
    }


}

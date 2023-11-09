/* Write a Java program to create a class Vehicle with a method called speedUp(). Create
two subclasses Car and Bicycle. Override the speedUp() method in each subclass to
increase the vehicle's speed differently.*/

package Inheritance;

public class Vehicle7 {

     int speed;

    public void speedUp() {
        speed += 50;
    }

    public int getSpeed() {
        return speed;
    }

}

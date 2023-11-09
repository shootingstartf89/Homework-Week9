/*Write a Java program to create a class called Vehicle with a method called drive().
Create a subclass called Car that overrides the drive() method to print "Repairing a
car"*/

package Inheritance;

public class Car2 extends Vehicle2 {
    public void drive() {
        System.out.println("Repair a Car");

    }

    public static void main(String[] args) {
        Car2 c=new Car2();   //Overriding the drive() method
        c.drive();
    }

}

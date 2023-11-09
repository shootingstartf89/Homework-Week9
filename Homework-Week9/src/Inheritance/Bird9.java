/* Write a Java program to create a base class Animal with methods move() and
 (). Create two subclasses Bird and Panthera. Override the move() method
in each subclass to describe how each animal moves. Also, override the makeSound()
method in each subclass to make a specific sound for each animal.*/


package Inheritance;

public class Bird9 extends Animal9 {

    public void move() {
        System.out.println("Bird flies");
    }

    @Override
    public void makeSound() {
        System.out.println("Bird chirps");

    }
}

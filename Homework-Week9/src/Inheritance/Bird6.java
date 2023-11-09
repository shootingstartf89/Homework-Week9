/*Write a Java program to create a base class Animal (Animal Family) with a method
called Sound(). Create two subclasses Bird and Cat. Override the Sound() method in
each subclass to make a specific sound for each animal.*/

package Inheritance;

public class Bird6 extends Animal6 {
    public void sound () {   //override sound method
        System.out.println("In the morning bird chirps very sweetly");
    }

}

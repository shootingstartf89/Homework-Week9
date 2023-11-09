/* Write a Java program to create a base class Animal with methods move() and
 (). Create two subclasses Bird and Panthera. Override the move() method
in each subclass to describe how each animal moves. Also, override the makeSound()
method in each subclass to make a specific sound for each animal.*/


package Inheritance;

public class Panthera9 extends Animal9 {

    public void move() {
        System.out.println("Panthera walks around");
    }

    @Override
    public void makeSound() {
        System.out.println("Panthera roars");
    }

    public static void main(String[] args) {

        Animal9 bird = new Bird9();
        Animal9 panthera = new Panthera9();


        bird.move();
        bird.makeSound();
        panthera.move();
        panthera.makeSound();


    }
}

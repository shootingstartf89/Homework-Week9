/*Write a Java program to create a base class Animal (Animal Family) with a method
called Sound(). Create two subclasses Bird and Cat. Override the Sound() method in
each subclass to make a specific sound for each animal.*/

package Inheritance;

public class Cat6 {
    public void sound() { //override sound()method
        System.out.println("The cat Meows");
    }

    public static void main(String[] args) {

        Animal6 animal = new Animal6();
        Bird6 bird = new Bird6();
        Cat6 cat = new Cat6();
        animal.sound();
        bird.sound();
        cat.sound();
    }
}



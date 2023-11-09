/*import Inheritance.Animal;Write a Java program to create a class called Animal with a method named move().
        Create a subclass called Cheetah that overrides the move() method to run.*/

package Inheritance;

public class Cheetah4 extends Animal4 {

    public void move() {    //Overriding the move () method
        System.out.println("Cheetah is the fastest animal in running");
    }


    public static void main(String[] args) {
        Animal4 a = new Animal4();
        a.move();
        Cheetah4 c= new Cheetah4();
        c.move();


    }

}

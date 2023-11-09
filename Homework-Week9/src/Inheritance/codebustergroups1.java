/*Write a Java program to create a class called codebuster with a method called
groupName(). Create a subclass called codebusterGroups() that overrides the
groupName() method.*/


package Inheritance;

public class codebustergroups1 extends codebuster1 {
    public void groupName() {       //Overriding the groupName() method
        System.out.println("Code1");
        System.out.println("Code2");
        System.out.println("Java");
        System.out.println("Agile");
        System.out.println("RestAssured");

    }

    public static void main(String[] args) {
        codebustergroups1 groups= new codebustergroups1();
        groups.groupName();
    }

}

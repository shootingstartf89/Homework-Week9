/* Write a Java program to create a class called Person with private instance variables
name, age. and country. Provide public getter and setter methods to access and modify
these variables. */



package Inheritance;

public class Person11 {

    private String name;
    private int age;
    private String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public static void main(String[] args) {

        Person11 person = new Person11();


        person.setName("Vivek Dhabalia");
        person.setAge(34);
        person.setCountry("India");


        String name = person.getName();
        int age = person.getAge();
        String country = person.getCountry();


        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Country: " + country);
    }
}

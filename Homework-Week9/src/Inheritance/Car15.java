/* Write a Java program to create a class called Car with private instance variables
company_name, model_name, year, and mileage. Provide public getter and setter
methods to access and modify the company_name, model_name, and year variables.
However, only provide a getter method for the mileage variable.*/


package Inheritance;

public class Car15 {

    private String Company_Name;
    private String Model_Name;
    private int Year;
    private double mileage;

    public String getCompany_Name () {
        return Company_Name;
    }
    public void setCompany_Name (String Company_Name) {
        this.Company_Name=Company_Name;
    }
    public String getModel_Name () {
        return Model_Name;
    }
    public void setModel_Name (String Model_Name) {
        this.Model_Name=Model_Name;
    }
    public int getYear () {
        return Year;
    }
    public void setYear (int Year) {
        this.Year= Year;
    }
    public double getMileage () {
        return mileage;
    }

    public static void main(String[] args) {
        Car15 car=new Car15();
       // Set the Values using setter methods
        car.setCompany_Name("Lexus");
        car.setModel_Name("City200H");
        car.setYear(2020);

      // Get the values using the getter methods
        String company_name = car.getCompany_Name();
        String model_name = car.getModel_Name();
        int year = car.getYear();
        double mileage = car.getMileage();

        // Print the values
        System.out.println("Company Name: " + company_name);
        System.out.println("Model Name: " + model_name);
        System.out.println("Year: " + year);
        System.out.println("Mileage: " + mileage);
    }
    }



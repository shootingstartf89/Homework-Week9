package Inheritance;

public class Programmer8 extends Employee8 {

    private double basicSalary;
    private double extrahoursPay;

    public Programmer8(String name, double basicSalary, double extrahoursPay) {
        super(name, "Programmer");
        this.basicSalary = basicSalary;
        this.extrahoursPay = extrahoursPay;
    }

    public double calculateSalary() {
        return basicSalary + extrahoursPay;
    }

    public static void main(String[] args) {
        Employee8 emp1 = new Manager8("Vivek", 60000.0, 6000.0);
        Employee8 emp2 = new Programmer8("Pankti", 40000.0, 1200.0);

        System.out.println("Manager: " + emp1.getName() + "\nRole: " + emp1.getRole() + "\nSalary: £" + emp1.calculateSalary());
        System.out.println("\nProgrammer: " + emp2.getName() + "\nRole: " + emp2.getRole() + "\nSalary: £" + emp2.calculateSalary());


    }











}

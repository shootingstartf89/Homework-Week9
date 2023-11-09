


package Inheritance;

public class Manager8 extends Employee8 {

    private double basicSalary;
    private double bonus;

    public Manager8(String name, double basicSalary, double bonus) {
        super(name, "Manager");
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return basicSalary + bonus;
    }



}

/*Write a Java program to create a class called Employee with private instance variables
employee_id, employee_name, and employee_salary. Provide public getter and setter
methods to access and modify the id and name variables, but provide a getter method
for the salary variable that returns a formatted string.*/


package Inheritance;

public class Employee14 {

    private int employee_id;
    private String employee_name;
    private double employee_salary;

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public double getEmployeeSalary() {
        return employee_salary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employee_salary = employeeSalary;
    }

    public String getFormattedSalary() {
        return String.format("£%.2f", employee_salary);
    }

    public static void main(String[] args) {
        Employee14 employee = new Employee14();

        // Set values using setter methods
        employee.setEmployee_id(10023);
        employee.setEmployee_name("Pankti Nanavati");
        employee.setEmployeeSalary(50000.00);

        // Get values using getter methods
        int employeeId = employee.getEmployee_id();
        String employeeName = employee.getEmployee_name();
        String formattedSalary = employee.getFormattedSalary();

        // Print the values
        System.out.println("Employee Details:");
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + employeeName);
        System.out.println("Salary: " + formattedSalary);
    }
}

/* Write a Java program to create a class called BankAccount with private instance
variables accountNumber and balance. Provide public getter and setter methods to
access and modify these variables.*/



package Inheritance;

public class BankAccount12 {

    private String accountNumber;
    private double balance;

    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber (String accountNumber) {
        this.accountNumber=accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance (double balance) {
        this.balance=balance;

    }

    public static void main(String[] args) {
        BankAccount12 Bankaccount=new BankAccount12();

        Bankaccount.setAccountNumber("HDFC-50100173726060");
        Bankaccount.setBalance(5000000.0);


        String accountNumber = Bankaccount.getAccountNumber();
        double balance = Bankaccount.getBalance();


        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
    }


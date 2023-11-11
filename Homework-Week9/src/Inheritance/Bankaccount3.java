/*Write a Java program to create a class known as "BankAccount" with methods called
deposit() and withdraw(). Create a subclass called SavingsAccount that overrides the
withdraw() method to prevent withdrawals if the account balance falls below one
hundred. */


package Inheritance;

public class Bankaccount3 {

    private String accountNumber;
    private double balance;

    public Bankaccount3(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance =balance+ amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance =balance- amount;
        } else {
            System.out.println("Balance is not sufficient");
        }
    }

    public String getAccountNumber() {

        return accountNumber;
    }

    public double getBalance() {

        return balance;
    }



}

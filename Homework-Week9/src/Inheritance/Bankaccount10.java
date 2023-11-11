/* Write a Java program to create a base class BankAccount with methods deposit() and
withdraw(). Create two subclasses SavingsAccount and CheckingAccount. Override the
withdraw() method in each subclass to impose different withdrawal limits and fees.*/

package Inheritance;

public class Bankaccount10 {

    private double balance;

    public Bankaccount10(double initialbalance) {

        this.balance = initialbalance;
    }


    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {

        balance=balance+ amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance=balance- amount;
        } else {
            System.out.println("Funds are not sufficient.");
        }
    }
}

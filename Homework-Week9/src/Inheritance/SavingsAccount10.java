/* Write a Java program to create a base class BankAccount with methods deposit() and
withdraw(). Create two subclasses SavingsAccount and CheckingAccount. Override the
withdraw() method in each subclass to impose different withdrawal limits and fees.*/

package Inheritance;

public class SavingsAccount10 extends Bankaccount10 {

    //private double initialbalance;
    private double withdrawalLimit;

    public SavingsAccount10(double initialbalance, double withdrawalLimit) {
        super(initialbalance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= withdrawalLimit) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal limit exceeded.");
        }
    }



}

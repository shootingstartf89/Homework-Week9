/* Write a Java program to create a base class BankAccount with methods deposit() and
withdraw(). Create two subclasses SavingsAccount and CheckingAccount. Override the
withdraw() method in each subclass to impose different withdrawal limits and fees.*/


package Inheritance;

public class CheckingAccount10 extends Bankaccount10 {

    private double overdraftFee;
    //private double initialbalance;

    public CheckingAccount10(double initialbalance, double overdraftFee) {
        super(initialbalance);
        this.overdraftFee = overdraftFee;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            super.withdraw(amount);
        } else {
            System.out.println("Overdraft fee applied.");
            super.withdraw(amount + overdraftFee);
        }
    }


    public static void main(String[] args) {
        Bankaccount10 savingsAccount = new SavingsAccount10(10000, 450);
        Bankaccount10 checkingAccount = new CheckingAccount10(1000, 100);

        withdrawFromAccount(savingsAccount, 200);
        withdrawFromAccount(checkingAccount, 150);

        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());
        System.out.println("Checking Account Balance: " + checkingAccount.getBalance());
    }

    public static void withdrawFromAccount(Bankaccount10 account, double amount) {
        account.withdraw(amount);
    }

}
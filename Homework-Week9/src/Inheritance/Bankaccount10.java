package Inheritance;

public class Bankaccount10 {

    private String accountnumber;
    private double balance;

    public Bankaccount10(double initialBalance) {

        this.balance = initialBalance;
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

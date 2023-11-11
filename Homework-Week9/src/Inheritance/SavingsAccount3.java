/*Write a Java program to create a class known as "BankAccount" with methods called
deposit() and withdraw(). Create a subclass called SavingsAccount that overrides the
withdraw() method to prevent withdrawals if the account balance falls below one
hundred. */


package Inheritance;

public class SavingsAccount3 extends Bankaccount3{

    public SavingsAccount3(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public void withdraw(double amount) { //Overriding withdraw method
        if (getBalance() - amount < 100) {
            System.out.println("Invalid Transaction");
        } else {
            super.withdraw(amount);
        }
    }

    public static void main(String[] args) {

        Bankaccount3 bank = new Bankaccount3("HDFC-50100173726060", 300);
        System.out.println("Enter Account number"+bank.getAccountNumber());
        bank.deposit(1000);
        System.out.println("New balance after deposit is"+bank.getBalance());
        bank.withdraw(600);
        System.out.println("New balance after withdraw is" +bank.getBalance());

        SavingsAccount3 savings=new SavingsAccount3("BOI-1000558899",450);
        System.out.println("Enter Account number"+savings.getAccountNumber());
        bank.deposit(200);
        System.out.println("New balance after deposit is"+bank.getBalance());
        savings.withdraw(620);
        System.out.println("New balance after withdraw is" +bank.getBalance());





    }



    }


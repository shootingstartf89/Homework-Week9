//Read 10 numbers from the console entered by the user and print the sum of those numbers

package Javaprogrammes;

import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 1;
        int sum = 0;

        while(i <= 10) {
            System.out.println("Enter number #" + i);

            boolean verifyNumber = scanner.hasNextInt();
            if(verifyNumber) {
                int number = scanner.nextInt();
                sum += number;
                i++;
            } else {
                System.out.println("Invalid number");
            }
            // Always return new userInput
            scanner.nextLine();
        }
        System.out.println("Sum of all numbers = " + sum);

        scanner.close();
    }
}

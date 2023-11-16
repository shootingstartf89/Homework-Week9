/*Write a program to input any number and check if it Armstrong number or not
        153 = (1*1*1)+(5*5*5)+(3*3*3)
        where:
        (1*1*1)=1
        (5*5*5)=125
        (3*3*3)=27
        So:
        1+125+27=153 */


package Javaprogrammes;

import java.util.Scanner;

public class Test10 {
    public int armstrong(int n) {

        int num = n, cubeSum = 0;

        while (num > 0) {
            int digit = num % 10;
            cubeSum = cubeSum + (digit * digit * digit);
            num /= 10;
        }

        if (cubeSum == n)
            return 1;
        else
            return 0;
    }

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = in.nextInt();

        Test10 obj = new Test10();
        int r = obj.armstrong(num);

        if (r == 1)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");
    }

}

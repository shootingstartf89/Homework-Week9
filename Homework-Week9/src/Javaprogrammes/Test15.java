//Display left angle triangle of * using nested for loops


package Javaprogrammes;

import java.util.Scanner;

public class Test15 {

    public static void main(String args[]){
        int i, j, num;
        System.out.println("Required packages have been imported");
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        num = scr.nextInt();
        System.out.println("The left triangle star pattern : ");
        for (i=0; i<num; i++){
            for (j=2*(num+i); j>=0; j--){
                System.out.print(" ");
            }
            for (j=0; j<=i; j++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/* Write a method named getEvenDigitSum with one parameter of type int called number.
The method should return the sum of the even digits within the number.
If the number is negative,the method should return -1 to indicate an invalid value.*/


package Javaprogrammes;

public class Test11 {


        public static void main(String[] args) {

            System.out.println("Even sum: " + getEvenDigitSum(18623));

        }

        public static int getEvenDigitSum(int number) {

            if (number < 0) {
                return -1;
            }

            int digit;
            int sum = 0;

            while (number > 0) {
                digit = number % 10;

                if (isEven(digit)) {
                    sum =sum+ digit;
                }

                number /= 10;
            }

            return sum;

        }

        public static boolean isEven(int number) {
            return number % 2 == 0;
        }
    }

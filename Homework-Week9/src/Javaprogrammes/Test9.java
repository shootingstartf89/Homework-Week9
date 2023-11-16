//Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)

package Javaprogrammes;

public class Test9 {

    public static void main(String[] args) {

        int count = 9, num1 = 0, num2 = 1;
        System.out.print("Fibonacci Series of "+count+" numbers:");

        for (int i = 1; i <= count; ++i)
        {
            System.out.print(num1+" ");

            int result = num1 + num2;
            num1 = num2;
            num2 = result;
        }
    }

}

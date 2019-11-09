package practice1.Loops;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {


        // Write a program to print Fibonacci series of n terms where n is input by user : 0 1 1 2 3 5 8 13 24 .....

        //  Example:
        //  Input:
        //  6
        //  Output:
        //  0 1 1 2 3 5


        // Write a program to print Fibonacci series of n terms where n is input by user : 0 1 1 2 3 5 8 13 24 .....

        //  Example:
        //  Input:
        //  6
        //  Output:
        //  0 1 1 2 3 5


        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int num = 0;
        int num1 = 1;
        int i;
        int num3;

        System.out.print(num + " " + num1);
        for (i = 2; i < n; i++) {
            num3 = num1 + num;

            num = num1;
            num1 = num3;
            System.out.print(" " + num3);


        }
    }
}
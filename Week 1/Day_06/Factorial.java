/**
 * A program that calculates the factorial of a number using a while loop.
 */

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        // Declaring variables
        

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            int fact = 1;

            int oldNum = num;

            while (oldNum > 0) {
                fact *= oldNum;
                oldNum--;
            }
            System.out.printf("%n%d%s%d%n", num, "! is equal to ", fact);
        }        
    }
}
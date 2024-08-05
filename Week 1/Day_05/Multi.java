/**
 * A program to print the multiplication table.
 */

import java.util.Scanner;
public class Multi {
    public static void main(String[] args) {
         
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number to print the multiplication table: ");
            int n = sc.nextInt();
            System.out.println("Multiplication table of " + n + " is:");
            for (int i = 1; i <= 10; i++) {
                 
                System.out.println(n + " x " + i + " = " + n * i);
            }
        }
    }
}
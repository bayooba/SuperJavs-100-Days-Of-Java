/**
 * Given an integer x, return true if x is palindrome integer.
 */

import java.util.Scanner;
public class NumberPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = sc.nextInt();
        if (isPalindrome(x)) {
            System.out.println("The given number is a palindrome.");
        } else {
            System.out.println("The given number is not a palindrome.");
        }
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int rem, reversed = 0;
        int temp = x;
        while (x != 0) {
            rem = x % 10; // Extracting the last digit or remainder of the number
            reversed = (reversed * 10) + rem; // Reversing the number
            x /= 10; // Removing the last digit from the number
        }
        return temp == reversed; 
    }
}

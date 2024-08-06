/**
 * A Program to check if a given string is palindrome or not.
 */

import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        if (isPalindrome(str)) {
            System.out.println("The given string is a palindrome.");
        } else {
            System.out.println("The given string is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }
        if (!str.equals(reversedStr)) {
            return false;
        }
        return true;
    }
}   
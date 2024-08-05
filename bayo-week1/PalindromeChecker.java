/**
 * Day 7
 * Implement a method to check if a given string is a palindrome.
 */

public class PalindromeChecker {
    static void palindromeChecker(String input) {
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(input.length() - (i + 1));
            if(input.charAt(i) == c && i == input.length() - 1) {
                System.out.println(input.substring(0,1).toUpperCase() + input.substring(1) + " is a palindrome");;
            } else if(input.charAt(i) != c && i == input.length() - 1) {
                System.out.println(input.substring(0,1).toUpperCase() + input.substring(1) + " is not a palindrome");;
            }
        }
    }

    public static void main(String[] args) {
        palindromeChecker("madam");
        palindromeChecker("car");
        palindromeChecker("racecar");
        palindromeChecker("02/02/2020");
        palindromeChecker("kayak");
    }
}

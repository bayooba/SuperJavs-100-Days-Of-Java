/**
 * Day 4
 * Implement a program that uses if-else statements to determine if a number is even or odd
 */

public class EvenOrOddNumber {
    static void evenOrOdd(double num) {
        if (num % 2 == 0) {
            System.out.println(num + " is an even number!");
        } else if(num % 2 != 0) {
            System.out.println(num + " is an odd number!");
        }
    }

    public static void main(String[] args) {
        evenOrOdd(5);
        evenOrOdd(10);
        evenOrOdd(1976536);
    }
}

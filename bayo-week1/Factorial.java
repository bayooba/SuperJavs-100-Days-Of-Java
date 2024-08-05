/**
 * Day 6
 * Write a program that calculates the factorial of a number using a while loop.
 */

public class Factorial {
    /**
     * Factorial --> n! = n * (n-1) * ... * 1
     */
    static void factorial(int num) {
        int result = 1;
        int entry = num;
        while(num > 0) {
            result *= num;
            num--;
        }
        System.out.println("The factorial of " + entry + " is " + result);
    }

    public static void main(String[] args) {
        factorial(2);
        factorial(3);
    }
}

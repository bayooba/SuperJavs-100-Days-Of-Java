/**
 * Day 3
 * This program calculates the sum, difference, product, and quotient of two numbers
 */

public class ArithmeticOperations {
    static void arithmeticOperation(double num1, double num2) {
        System.out.println("Addition = " + (num1 + num2));
        System.out.println("Difference = " + (num1 - num2));
        System.out.println("Product = " + (num1 * num2));
        System.out.println("Quotient = " + (num1 / num2) + "\n");
    }

    public static void main(String[] args) {
        arithmeticOperation(5.0,3.0);
        arithmeticOperation(10,8);
    }
}

/**
 * Day 5
 * Create a program that prints the multiplication table for a given number using a for loop
 */

public class MultiplicationTable {
    static void multiplicationTable(int num){
            System.out.printf("%20s%4d%n", "Multiplication Table", num);
        for (int i = 1; i <= 12; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
        System.out.println("\r");
    }

    public static void main(String[] args) {
        multiplicationTable(5);
        multiplicationTable(10);
        multiplicationTable(30);
    }
}

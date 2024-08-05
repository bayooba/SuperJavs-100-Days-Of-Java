/**
 * A program to print the multiplication table of a given number n.
 */

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Multiplication table");
        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 12; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
            }
            System.out.println("=================");
        }
    }
}
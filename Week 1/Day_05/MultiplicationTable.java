/**
 * A program to print the multiplication table.
 */

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Multiplication table");
        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 15; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
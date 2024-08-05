import java.util.Scanner;
public class ArithOperations {
    public static void main(String[] args) {
        // Declaring variables
        int a, b, sum, diff, prod, div, mod;

        try ( // using the Scanner class to take input from the user
                Scanner sc = new Scanner(System.in)
        // taking input from the user
        ) {
            System.out.println("Enter a number: ");
            a = sc.nextInt();
            
            System.out.println("Enter another number: ");
            b = sc.nextInt();
        }
        
        // performing arithmetic operations
        sum = a + b;    // addition or sum
        diff = a - b;   // subtraction or difference
        prod = a * b;   // multiplication or product
        div = a / b;    // division or quotient
        mod = a % b;    // modulus or remainder

        // displaying the results
        System.out.println("");
        System.out.println("=== Arithmetic Operations on " + a + " and " + b+ " ===");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + prod);
        System.out.println("Division: " + div);
        System.out.println("Modulus: " + mod);
    }
}
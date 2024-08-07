import java.util.Scanner;

public class IfAndElseStatement {public static void main(String[] args) {

    int pin;

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your pin");
    pin = scanner.nextInt();

    if (pin == 1914)
        System.out.println("pin is correct, proceed");
    else
        System.out.println("wrong pin, try again");
    }
}

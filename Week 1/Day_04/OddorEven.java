/**
 * A program that uses if-else statements to determine if a number is even or odd.
 */

import java.util.Scanner;
public class OddorEven{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        if ((num % 2) == 0 ){
            System.out.printf("%n%d%s%n", num, " is an Even Number");
        }
        else {
            System.out.printf("%n%d%s%n", num, " is an Odd Number");
        }

    }
}
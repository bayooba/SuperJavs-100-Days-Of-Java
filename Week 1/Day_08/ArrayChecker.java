/**
 * Proram to check the minimum and maximum element in an Array
 */

import java.util.Scanner;
public class ArrayChecker {

    // Get the Elements of the Array from the User
    public static int[] getArray(){
        Scanner sc = new Scanner(System.in);
        
        // Get Size of the array
        System.out.print("Enter the Size of the Array: ");
        int size = sc.nextInt();

        // Check If array size is zero or empty
        if (size <= 0){
            System.out.println("Size not obtainable");
        }
        //Create Array
        int[] arr = new int[size];

        // prompt User to enter an array
        System.out.println("Enter " + size + " integers to populate the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    // Method to check for maximum element
    public static int maxElem(int[] arr){
        int maximum = arr[0];
        for(int i = 1; i < arr.length; i++){
            if (arr[i] > maximum){
                maximum = arr[i];
            }
        }
        return maximum;
    }

    // Method to check for minimum element
    public static int minElem(int[] arr){
        int minimum = arr[0];
        for(int i = 1; i < arr.length; i++){
            if (arr[i] < minimum){
                minimum = arr[i];
            }
        }
        return minimum;
    }

    // Main Method
    public static void main(String[] args){

        // Generate Array
        int[] myArray = getArray();

        Scanner sc = new Scanner(System.in);
        int opt = -1; // Initialize opt with a value
        while (opt != 0) {
            System.out.printf("%n%s%n%s%n%s%n", "Select an Option", "1 for Minimum Element", "2 for Maximum");
            opt = sc.nextInt();
            switch (opt) {
                case 1 -> {
                    int resMin = minElem(myArray);
                    System.out.println("The Minimum element is " + resMin);
                }
                case 2 -> {
                    int resMax = maxElem(myArray);
                    System.out.println("The Maximum element is " + resMax);
                }
                default -> System.err.println("Please select the right option");
            }
        }
    }    
}

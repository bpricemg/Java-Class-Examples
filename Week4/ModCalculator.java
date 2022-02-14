/**
 * Take two imputs from user to make a mod calculator.
 */

import java.util.Scanner;

class ModCalculator {
    public static void main(String[] args) {
        // Start a scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user for the first number
        System.out.print("First number: ");
        int first = input.nextInt();

        // Prompt the user for the second number
        System.out.print("Second number: ");
        int second = input.nextInt();

        // Print mod result
        System.out.println(first + " mod " + second + " = " + (first % second));
    }
}
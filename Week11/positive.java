/**
 * Get a positive number from the user
 */

import java.util.Scanner;

class positive {
    public static void main (String[] args) {
        // Starts a scanner
        Scanner input = new Scanner(System.in);

        // Declare a variable with proper scope
        int answer;

        // Ask the user for a postive integer
        do {
            System.out.print("Positive integer please: ");
            answer = input.nextInt();
        } while (answer < 0); // Keep asking while the number is negative

        //  Tell the user what the chose
        System.out.println("You chose the positive number " + answer);
    }
}
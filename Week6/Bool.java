/**
 * Determine if a number is positive
 */

import java.util.Scanner;

class Bool {
    public static void main (String[] args) {
        // Get an integer from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Integer please: ");
        int i = input.nextInt();

        // If the number is positive
        if (i > 0) {
            System.out.println(i + " is positive");
        } else if (i < 0) {
            System.out.println(i + " is negative");
        } else {
            System.out.println(i + " is neither positive or negative");
        }
        
    }
}
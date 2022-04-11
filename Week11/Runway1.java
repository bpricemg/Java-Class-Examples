// Compute the runway length
// This time we wont allow the user to enter negative numbers or strings/characters/etc. 

import java.util.Scanner;

public class Runway1 {
    public static void main(String[] ags) {
        // Create scanner
        Scanner input = new Scanner(System.in);

        // Enter the speed
        double v = -1; // Initialize outside of the do-while loop for proper scope
        do { 
            try { // Try to get the speed
                System.out.print("Enter the speed (in meters/second): ");
                v = input.nextDouble();
            } catch (Exception e) { // Catch any major errors
                input.next(); // Advance the Scanner buffer to the next input
            }
        } while (v < 0); // Continue to re-prompt if the value is negative
            
        // Enter the acceleration
        double a = -1; // Initialize outside of the do-while loop for proper scope
        do { 
            try { // Try to get the speed
                System.out.print("Enter the acceleration (in meters/second squared): ");
                a = input.nextDouble();
            } catch (Exception e) { // Catch any major errors
                input.next(); // Advance the Scanner buffer to the next input
            }
        } while (a < 0); // Continue to re-prompt if the value is negative
        

        // Print result
        double runway = Math.pow(v, 2) / (2 * a);
        System.out.println("The minimum runway length for this airplane is " + runway + " meters");
    }
}
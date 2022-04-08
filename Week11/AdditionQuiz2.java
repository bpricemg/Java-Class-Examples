/**
 * Addition quiz for an elementary student
 * This time we will will protect the program from crashing if the user provides
 * something other than an integer
 */

import java.util.Scanner;

class AdditionQuiz2 {
    public static void main(String[] args) {
        // Create two random integers between 0 and 9 (inclusive)
        int random1 = (int) (Math.random() * 10);
        int random2 = (int) (Math.random() * 10);

        // Declare vairbale outside of do-while loop for proper scope
        // Note* the answer can never be -1
        int answer = -1;

        // Start a scanner
        Scanner input = new Scanner(System.in);
        
        do {
            // Ask the user what the sum of those two ints are
            System.out.print("What is " + random1 + " plus " + random2 + "? ");

            // Get the user's input with a Scanner
            while (!input.hasNextInt()) {
                System.out.println("Please enter an integer for an answer.\n");
                input.next();
                System.out.print("What is " + random1 + " plus " + random2 + "? ");
            }           

            answer = input.nextInt();

            // If the user gets the incorrect answer, let them know
            if (answer != random1 + random2) {
                System.out.println("Sorry, your answer is incorrect. Try again.\n");
            }
            
        } while (answer != random1 + random2); // Reprompt the user while they get it wrong

        // Let the user know that they are correct!
        System.out.println("You are correct! :)");
    }
}
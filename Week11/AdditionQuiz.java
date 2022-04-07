/**
 * Addition quiz for an elementary student
 */

import java.util.Scanner;

class AdditionQuiz {
    public static void main(String[] args) {
        // Create two random integers between 0 and 9 (inclusive)
        int random1 = (int) (Math.random() * 10);
        int random2 = (int) (Math.random() * 10);

        // Declare vairbale outside of do-while loop for proper scope
        int answer;
        
        do {
            // Ask the user what the sum of those two ints are
            System.out.print("What is " + random1 + " plus " + random2 + "? ");

            // Get the user's input with a Scanner
            Scanner input = new Scanner(System.in);
            answer = input.nextInt();

            // If the user gets the incorrect answer, let them know
            if (answer != random1 + random2) {
                System.out.println("Sorry, your answer is incorrect. Try again.\n");
            }
            
        } while (answer != random1 + random2); // Reprompt the user while they get it wrong
    }
}
/**
 * Addition quiz for an elementary student
 */

import java.util.Scanner;

class AdditionQuiz {
    public static void main(String[] args) {
        // Create two random integers between 0 and 9 (inclusive)
        int random1 = (int) (Math.random() * 10);
        int random2 = (int) (Math.random() * 10);

        // Ask the user what the sum of those two ints are
        System.out.print("What is " + random1 + " plus " + random2 + "? ");

        // Get the user's input with a Scanner
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();

        // If they are correct, print "You are correct"
        if (answer == random1 + random2) {
            System.out.println("You are correct!");
        }

        // Else, if they are incorrect, print "Sorry, you are not correct. 
        // The correct answer is..."
        else {
            System.out.println("Sorry, you are not correct. The correct answer is " + (random1 + random2) + ".");
        }
    }
}
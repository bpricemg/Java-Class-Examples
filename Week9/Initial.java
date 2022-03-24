// Prompt the user for their first initial and then print it out as a capital letter

import java.util.Scanner;

class Initial {
    public static void main(String[] args) {
        // Start a scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user for their first initial
        System.out.print("First initial: ");
        String initial = input.nextLine();

        // Let check to see if the user only gave us one letter
        if (initial.length() != 1) {
            // Print an error message
            System.out.println("Error - be sure your input is only one character!");

            // Quit the program
            System.exit(1);
        }

        // Save the single element string as a character
        char first_initial = initial.charAt(0);

        // Make sure the character is a letter
        // if (Character.isLetter(first_initial) == false) {
        if (!Character.isLetter(first_initial)) {
            // Print an error message
            System.out.println("Error - your input is not a letter!");

            // Quit the program
            System.exit(2);
        }

        // Lets make the first initial a capital letter
        first_initial = Character.toUpperCase(first_initial);

        // Print the result
        System.out.println("Your first initial is: " + first_initial);
    }
}
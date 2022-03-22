import java.util.Scanner;

class CharInput {
    public static void main(String[] args) {
        // Start the scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user for a character
        System.out.print("Enter a character: ");
        String c = input.nextLine();

        // Error checking - be sure the user gives us only a single character
        // If user does not provide a single character
        if (c.length() != 1) {
            // Print an error message
            System.out.println("Please input a single character. Try again.");
            // Force stop the program
            System.exit(1);
        }

        // Convert that single character string into a char
        char ch = c.charAt(0);

        // Print out the character the user gave us
        System.out.println("The character enetered is " + ch);
    }
}
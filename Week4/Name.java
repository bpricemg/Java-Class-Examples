/**
 * Say hello to a user that inputs both their first and last names
 */

import java.util.Scanner;

class Name {
    public static void main(String[] args) {
        // Start a scanner
        Scanner input = new Scanner(System.in);
        
        // Prompt and recieve user's first name
        System.out.print("First name: ");
        String firstName = input.nextLine();
        
        // Prompt and recieve user's last name
        System.out.print("Last name: ");
        String lastName = input.nextLine();

        // Say hello to the user
        System.out.println("hello, " + firstName + " " + lastName);
        }
}
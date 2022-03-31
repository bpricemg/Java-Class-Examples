// Separate first, middle, and last name into separate strings
import java.util.Scanner;

class Separated {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Name: ");
        
        // Use input.next() to read each space separated word as a different string
        String firstName = input.next();
        String middleName = input.next();
        String lastName = input.next();

        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);

        // We can concatenate with the + symbol
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("Full name: " + fullName);
    }
}
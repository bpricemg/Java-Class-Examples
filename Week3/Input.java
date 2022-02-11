/**
 * Says hello to a the user
 */
import java.util.Scanner;

class Input {
    public static void main(String[] args) {
        // Start a scanner
        Scanner input = new Scanner(System.in);
        
        // Get the user's name
        System.out.print("Name: ");
        String name = input.nextLine();

        // Say hello
        System.out.println("Hello, " + name + "!");
    }
}
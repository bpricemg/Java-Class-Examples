// Sampling methods in the String class
// https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
import java.util.Scanner;

class Message {
    public static void main(String[] args) {
        // Get a string from the user
        Scanner input = new Scanner(System.in);
        System.out.print("String please: ");
        String message = input.nextLine();

        // Find the length of a string
        System.out.println("The length of this string is: " + message.length());

        // Find the first character of this string
        // note* it's at index "0"
        System.out.println("The first character of this string is: " + message.charAt(0));

        // Find the last character of this string
        // note* it's at index "length - 1"
        System.out.println("The last character of this string is: " + message.charAt(message.length() - 1));

        // Find the index of the first 'a'
        System.out.println("The index of the first 'a' is: " + message.indexOf('a'));

        // Replace 'B' with '3'
        System.out.println("The string with all the 'B' characters replaced with a '3': " + message.replace('B', '3'));
    }
}
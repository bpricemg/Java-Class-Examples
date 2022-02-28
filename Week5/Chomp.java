/**
 * Access and chomp off last digit
 */

import java.util.Scanner;

class Chomp {
    public static void main(String[] args) {
        // Get an integer from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Integer please: ");
        int i = input.nextInt();

        // Acess the last digit only, this is done neatly with "mod 10"
        int lastDigit = i % 10;
        System.out.println("The last digit is: " + lastDigit);

        // Remove the last digit only, this is done neatly with integer division
        // Reminder* an integer divided by an integer is an integer
        // i = i / 10;
        i /= 10;
        System.out.println("After removing the last digit: " + i);
        
    }
}
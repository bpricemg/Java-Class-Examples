/**
 * Determine if the week number is a weekday or a weekend
 */

import java.util.Scanner;

class Switch {
    public static void main(String[] args) {
        // Start a scanner
        Scanner input = new Scanner(System.in);

        // Get the day number from the user (day 0 - day 6)
        System.out.print("Day number (0 through 6): ");
        int day = input.nextInt();

        switch(day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5: System.out.println("Weekday");
                    break;
            case 0:
            case 6: System.out.println("Weekend!");
                    break;
            default: System.out.println("Error");
                     break;
        }
    }
}
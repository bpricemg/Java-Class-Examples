/**
 * Get a positive number from the user
 */

import java.util.Scanner;

class positive {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        int answer;
        
        do {
            System.out.print("Positive integer please: ");
            answer = input.nextInt();
        } while (answer < 0);
    }
}
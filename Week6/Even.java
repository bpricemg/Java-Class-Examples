/**
 * Determines if an integer is even
 */

import java.util.Scanner;

class Even {
    public static void main(String[] args) {
        // Start the scanner
        Scanner input = new Scanner(System.in);
        
        // Get an integer from the user
        System.out.print("Integer please: ");
        int i = input.nextInt();
        
        // Even if when we divide by 2 the remainder is 0
        if (i % 2 == 0) {
            System.out.println(i + " is even");
        } else {
            System.out.println(i + " is odd");
        }
    }
}
/**
 * Compute the sales tax
 */

import java.util.Scanner;

class SalesTax {
    public static void main(String[] args) {
        // Start a scanner
        Scanner input = new Scanner(System.in);

        // Get the purchase price from the user
        System.out.print("Purchase price: $");
        double price = input.nextDouble();

        // Calculate the sales tax
        double tax = price * 0.0625;

        // Print out the sales tax and the total price
        // Note* not bad but it prints 4 decimal places instead of two!
        System.out.println("The sales tax is: $" + tax);
        System.out.println("The total price is: $" + (price + tax));
        
    }
}
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

        // Round the sales tax so that we only have two decimal places
        // Note* we must divide by 100.0 so that we don´t have integer division
        tax = Math.round(tax * 100) / 100.0;

        // Print out the sales tax and the total price
        // Note* not bad but it prints many decimal places instead of two!
        System.out.println("The sales tax is: $" + tax);
        System.out.println("The total price is: $" + (price + tax));
        
    }
}
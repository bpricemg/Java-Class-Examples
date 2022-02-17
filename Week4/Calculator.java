/**
 * A calculator for two numbers
 */

import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        // Start a scanner
        Scanner input = new Scanner(System.in);

        // Prompt user for the first numbers
        System.out.print("x: ");
        int x = input.nextInt();
    
        // Prompt user for the second number
        System.out.print("y: ");
        int y = input.nextInt();

        // Do some calculations and print them out
        int add = x + y;
        System.out.println("Added: " + add);

        int subtract = x - y;
        System.out.println("Subtrcted: " + subtract);

        // Typecast x and y to a double for division
        double divide = (double)x / (double)y;
        System.out.println("Divided: " + divide);

        int multiply = x * y;
        System.out.println("Multiplied: " + multiply);

        // Math.pow() will return a double so we typecast to an int
        int power = (int)Math.pow(x, y);
        System.out.println("x to the y power: " + power);
        
    }
}
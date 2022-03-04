/**
 * A BMI Calculator
 */

import java.util.Scanner;

class BMI {
    public static void main(String[] args) {
        // Prompt the user for the height and weight
        Scanner input = new Scanner(System.in);

        System.out.print("Height (in inches): ");
        double height = input.nextDouble();

        System.out.print("Weight (in pounds): ");
        double weight = input.nextDouble();

        // Determine BMI using the formula
        double bmi = weight / Math.pow(height, 2) * 703;

        // Round the BMI to the nearest 10th
        bmi = Math.round(bmi * 10) / 10;
        
        System.out.println("The BMI is " + bmi);

        // Display the weight status results
        if (bmi < 18.5) {
            System.out.println("Underweight");
        }
        else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Healthy");
        }
        else if (bmi >= 25 && bmi < 30) {
            System.out.println("Overweight");
        }
        else {
            System.out.println("Obesity");
        }
        
    }
}
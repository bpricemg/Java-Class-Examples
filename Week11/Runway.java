import java.util.Scanner;

public class Runway {
    public static void main(String[] ags) {
        // Create scanner
        Scanner input = new Scanner(System.in);

        // Enter the speed
        System.out.print("Enter the speed (in meters/second): ");
        double v = input.nextDouble();

        // Enter the acceleration
        System.out.print("Enter the acceleration (in meters/second squared): ");
        double a = input.nextDouble();

        // Print result
        double runway = Math.pow(v, 2) / (2 * a);
        System.out.println("The minimum runway length for this airplane is " + runway + " meters");
    }
}
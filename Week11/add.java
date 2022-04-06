/**
 * Displays the sumer from 0 to 999999999
 */

class add {
    public static void main(String[] args) {
        // Initialize variables
        int count = 0; 
        int sum = 0;

        // Loop 100000000 times
        while (count < 100000000) {
            // Add the count to the sum
            // sum = sum + count;
            sum += count;

            // Increase the count by 1
            count++;
        }

        // Print the value of the sum
        System.out.println("The sum is " + sum);
    }
}
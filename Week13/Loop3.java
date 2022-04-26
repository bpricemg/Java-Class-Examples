// Print the number of hashes determined by a user

import java.util.Scanner;

class Loop3 {
    public static void main(String[] args) {
        // Get the number of hashes from the user
        Scanner input = new Scanner(System.in);
        int n = -1;
        do {
            System.out.print("Positive integer: ");
            while (!input.hasNextInt()) {
                input.next();
                System.out.print("Positive integer: ");
            }
            n = input.nextInt();
        } while (n <= 0);

        // Print out n hashes vertically/stacked
        for(int i = 0; i < n; i++){
            System.out.println("#");
        }
    }
}
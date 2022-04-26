// Print the number of hashes determined by a user in a square

import java.util.Scanner;

class Loop4 {
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

        // Print out n hashes in a square
        for(int row = 0; row < n; row++){
            for(int col = 0; col < n; col++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
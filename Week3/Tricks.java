/**
 * Augmented Assignment Operators
 */ 

class Tricks {
    public static void main(String[] args) {
        // Initialize a value to -5
        int n = -5;

        // Increase the value of n by 3 (note* this can also be done with n = n + 3;)
        n += 3;

        n -= -5; // This will increase the number by 5
        n /= 2; // This will divide the number by 2 (Note* integer disision)
        n %= 4; // This is the remainder when dividing the number by 4

        // Print the value of n
        System.out.println(n);
    }
}
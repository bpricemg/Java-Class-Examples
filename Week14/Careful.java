class Careful {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("The value before the call is: " + x);

        // Call the method
        x = increment(x);

        System.out.println("The value after the call is: " + x);
    }

    /** Increment the value of n by 1 */
    public static int increment(int n) {
        n++;
        System.out.println("The value in the method is: " + n);
        return n;
    }
}
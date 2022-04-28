/** 
 * Add two integers together
 */

class Add {
    public static void main(String[] args) {
        int first = 10;
        int second = 5;

        // Method call
        int sum = addTwoInts(first, second);

        System.out.println("The sum is " + sum);
    }

    /**
     * addTwoInts will take in two integers as a paramenter and return an integer back
     */
    public static int addTwoInts(int i, int j) {
        int result = i + j;

        // Results that we return back to the main method
        return result;
    }
}
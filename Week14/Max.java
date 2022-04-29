class Max {
    public static void main(String[] args) {
        double i = 5.8;
        double j = 10;

        double k = maxNumber(i, j); // Method call

        System.out.println("The largest number is " + k);
    }

    /** A method that returns the maximum number */
    public static double maxNumber(double first, double second) {
        double largest;
        
        if (first > second) {
            largest = first;
        } else {
            largest = second;
        }

        return largest;
    }
}
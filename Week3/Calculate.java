/**
 * Sample all of the native matematical operations
 */

class Calculate {
    public static void main(String[] args) {
        int first = 5;
        int second = 2;

        // Addition
        int addition = first + second;
        System.out.println(first + " plus " + second + " equals " + addition);

        // Subtraction
        int subtraction = first - second;
        System.out.println(first + " minus " + second + " equals " + subtraction);

        // Multiplication
        int multiplication = first * second;
        System.out.println(first + " times " + second + " equals " + multiplication);

        // Integer Division
        int division = first / second;
        System.out.println(first + " divided by " + second + " equals " + division);

        // Division with a double
        double firstDouble = 5.0;
        double secondDouble = 2.0;
        double divisionDouble = firstDouble / secondDouble;
        System.out.println(firstDouble + " divided by " + secondDouble + " equals " + divisionDouble);

        // Mod - this is like asking "What is the remainder?"
        int mod = first % second;
        System.out.println(first + " mod " + second + " equals " + mod);
    }
}
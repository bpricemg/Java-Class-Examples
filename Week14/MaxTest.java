class MaxTest {
    public static void main(String[] args) {
        double i = 6.5;
        double j = -3;
        System.out.println("The maximum between " + i + " and " + j + " is " + max(i, j));
    }

    /** Retrun the max between two numbers */
    public static double max(double num1, double num2) {
        if (num1 > num2) {
            return num1;
        }

        return num2;
    }
}
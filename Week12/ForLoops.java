// Test out different for loops

class ForLoops {
    public static void main(String[] args) {
        // Print "Welcome to Java" 5 times
        // Note* i starts at zero and i++ increases the value of i by 1
        for (int i = 0; i < 5; i++) {
            System.out.println("Welcome to Java");
        }

        System.out.println();

        // Print the even numbers up to 20
        // Note* i += 2 increments the value of i by 2
        for (int i = 0; i <= 20; i += 2) {
            System.out.println(i);
        }
    }
}
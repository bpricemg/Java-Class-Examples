/**
 * Say hello to a user using their name
 */

class Hello {
    public static void main(String[] args) {
        // New variable of type String that holds the user's name
        String firstName = "Madison";

        // Says hello to the user's first name
        // Note* this prints then starts a new line
        // This prints a "\n" at the end of the string automatically
        System.out.println("Hello, " + firstName + "!");

        // Note* this prints and does NOT start a new line
        // Can force a new line with "\n"
        System.out.print("Hello, " + firstName + "!\n");
    }
}
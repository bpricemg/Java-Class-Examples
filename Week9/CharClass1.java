import java.util.Scanner;

class CharClass1 {
    public static void main(String[] args) {
        // Get a character from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Character please: ");
        String c = input.nextLine();

        // Erorr checking
        if (c.length() != 1) {
            System.out.println("Please input a single character. Try again.");
            System.exit(1);
        }

        // Conver the single character string to a character
        char ch = c.charAt(0);
        

        if (Character.isUpperCase(ch)) {
            System.out.println(ch + " is an uppercase letter");
        } else if (Character.isLowerCase(ch)) {
            System.out.println(ch + " is an lowercase letter");
        } else if (Character.isDigit(ch)) {
            System.out.println(ch + " a numeric character");
        } else {
            System.out.println(ch + " is neither a letter or a numeric character");
        }
    }
}
import java.util.Scanner;

class Compare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("First string: ");
        String s1 = input.nextLine();

        System.out.print("Second string: ");
        String s2 = input.nextLine();

        if(s1.equals(s2)) {
            System.out.println("These strings are the same!");
        }

        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("These strings are the same when ignoring the case!");
        }
    }
}
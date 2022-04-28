// Print out a student's grade as a letter

import java.util.Scanner;

class Grade {
    public static void main(String[] args) {
        // Test printGrade()
        //printGrade(82);
        //printGrade(97);
        //printGrade(59);
        
        // Ask the user for their number grade
        Scanner input = new Scanner(System.in);
        System.out.print("Number grade: ");
        double grade = input.nextDouble();

        // Print out their letter grade with printGrade()
        System.out.print("Your letter grade is a ");
        printGrade(grade);
        
    }

    /** A method that prints the letter grade given a number grade */
    public static void printGrade(double score) {
        if (score >= 90) {
            System.out.println('A');
        } else if (score >= 80) {
            System.out.println('B');
        } else if (score >= 70) {
            System.out.println('C'); 
        } else if (score >= 60) {
            System.out.println('D');
        } else {
            System.out.println('F');
        }
    }
}
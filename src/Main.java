import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // new scanner object for keyboard input

        double grade1 = 1.0, grade2 = 1.0, grade3 = 1.0; // initialize variables
        double average = 1.0; // initialize variables

        System.out.println("Enter grade 1: ");
        grade1 = input.nextDouble(); // ask for first grade

        System.out.println("Enter grade 2: ");
        grade2 = input.nextDouble(); // ask for second grade

        System.out.println("Enter third grade: ");
        grade3 = input.nextDouble(); // ask for third grade

        // call method avgGrades, pass grades as parameters, method returns average of grades
        average = avgGrades(grade1, grade2, grade3);

        System.out.println("\nThe average of these grades is: " + average);
    }
    public static double avgGrades(double a, double b, double c) {
        return (a+b+c) / 3.0;
    }
}
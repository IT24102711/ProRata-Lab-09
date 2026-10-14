import java.util.Scanner;

public class IT24102711Lab9Q4 {

    // Method to calculate final mark
    public static double calcFinalMark(double assignmentMark, double examMark) {
        return (0.3 * assignmentMark) + (0.7 * examMark);
    }

    // Method to find grade based on final mark
    public static char findGrades(double finalMark) {
        if (finalMark >= 75) {
            return 'A';
        } else if (finalMark >= 60) {
            return 'B';
        } else if (finalMark >= 50) {
            return 'C';
        } else {
            return 'F';
        }
    }

    // Method to print details of a student
    public static void printDetails(String name, double finalMark, char grade) {
        System.out.printf("%-10s %-10.2f %-5c%n", name, finalMark, grade);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int STUDENT_COUNT = 5;
        String[] names = new String[STUDENT_COUNT];
        double[] assignmentMarks = new double[STUDENT_COUNT];
        double[] examMarks = new double[STUDENT_COUNT];
        double[] finalMarks = new double[STUDENT_COUNT];
        char[] grades = new char[STUDENT_COUNT];

        for (int i = 0; i < STUDENT_COUNT; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            names[i] = scanner.nextLine();

            System.out.print("Enter assignment mark (out of 100) for " + names[i] + ": ");
            assignmentMarks[i] = scanner.nextDouble();

            System.out.print("Enter exam paper mark (out of 100) for " + names[i] + ": ");
            examMarks[i] = scanner.nextDouble();

            scanner.nextLine(); // Clear the newline character

            finalMarks[i] = calcFinalMark(assignmentMarks[i], examMarks[i]);
            grades[i] = findGrades(finalMarks[i]);
        }

        System.out.println("\nName       Final Mark  Grade");
        for (int i = 0; i < STUDENT_COUNT; i++) {
            printDetails(names[i], finalMarks[i], grades[i]);
        }

        scanner.close();
    }
}

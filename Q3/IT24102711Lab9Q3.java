import java.util.Scanner;

public class IT24102711Lab9Q3 {

    // Method  add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Method  multiply two integers
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Method to square a number
    public static int square(int a) {
        return a * a;
    }

    public static void main(String[] args) {
        // First expression: (3 * 4 + 5 * 7)^2
        int part1 = multiply(3, 4);     // 3 * 4 = 12
        int part2 = multiply(5, 7);     // 5 * 7 = 35
        int sum1 = add(part1, part2);   // 12 + 35 = 47
        int result1 = square(sum1);     // 47^2 = 2209

        // Second expression: (4 + 7)^2 + (8 + 3)^2
        int sum2 = add(4, 7);           // 11
        int sum3 = add(8, 3);           // 11
        int result2 = add(square(sum2), square(sum3)); // 121 + 121 = 242

        // Display results
        System.out.println("Result of (3 * 4 + 5 * 7)^2        : " + result1);
        System.out.println("Result of (4 + 7)^2 + (8 + 3)^2    : " + result2);
    }
}

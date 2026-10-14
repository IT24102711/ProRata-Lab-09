import java.util.Scanner;

public class IT24102711Lab9Q2 {

    // Method to calculate area of a circle
    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read radius value from user
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        // Call the method and display result
        double area = circleArea(radius);
        System.out.println("The area of the circle with radius " + radius + " is : " + area);

        input.close();
    }
}

// MainApp.java
import java.util.Scanner;
import equations.GetSolutionOfQuadraticEquation;  // Import the GetSolutionOfQuadraticEquation class

public class Roots {

    public static void main(String[] args) {
        // Input coefficients a, b, and c from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        // Use the GetSolutionOfQuadraticEquation class to calculate and print the roots
        String roots = GetSolutionOfQuadraticEquation.solveEquation(a, b, c);
        System.out.println(roots);

        // Close the scanner
        scanner.close();
    }
}

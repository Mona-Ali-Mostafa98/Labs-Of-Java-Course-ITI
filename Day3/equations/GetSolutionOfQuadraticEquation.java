package equations;

import java.util.function.BiFunction;

public class GetSolutionOfQuadraticEquation {

    public static String solve(double a, double b, double c) {
        0
            double resultUnderSqrRoot = bValue * bValue - 4 * a * c;

            if (resultUnderSqrRoot > 0) {
                double root1 = (-bValue + Math.sqrt(resultUnderSqrRoot)) / (2 * a);
                double root2 = (-bValue - Math.sqrt(resultUnderSqrRoot)) / (2 * a);
                return "Roots are real and distinct: " + root1 + ", " + root2;
            } else if (resultUnderSqrRoot == 0) {
                double root = -bValue / (2 * a);
                return "Root is real and repeated: " + root;
            } else {
                double realPart = -bValue / (2 * a);
                double imaginaryPart = Math.sqrt(Math.abs(resultUnderSqrRoot)) / (2 * a);
                return "Roots are complex: " + realPart + " + " + imaginaryPart + "i, " +
                       realPart + " - " + imaginaryPart + "i";
            }
        };

        return getSolutionOfQuadraticEquation.apply(b, c);
    }
}
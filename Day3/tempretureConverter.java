import java.util.Scanner;
import java.util.function.Function;

class TemperatureConverter {

    public static void main(String[] args) {
        // Create a Function to convert celsius to Fahrenheit
        Function<Double, Double> celsiusToFahrenheitFunction = celsius -> (celsius * 9/5) + 32;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in celsius: ");
        
        if (scanner.hasNextDouble()) {
            double celsiusTemperature = scanner.nextDouble();

            double fahrenheitTemperature = celsiusToFahrenheitFunction.apply(celsiusTemperature);

            System.out.println("Temperature in Fahrenheit: " + fahrenheitTemperature);
        } else {
            System.out.println("Invalid input. Please enter a valid number.");
        }

        scanner.close();
    }
}

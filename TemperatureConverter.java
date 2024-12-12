import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        
        Scanner user_input = new Scanner(System.in);
        
        System.out.println("Choose the type of conversion:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = user_input.nextInt();
        
        if (choice == 1) {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = user_input.nextDouble();
            double fahrenheit = (celsius * 9/5) + 32;
            System.out.println("Temperature in Fahrenheit is: " + fahrenheit);
        } else if (choice == 2) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = user_input.nextDouble();
            double celsius = (fahrenheit - 32) * 5/9;
            System.out.println("Temperature in Celsius is: " + celsius);
        } else {
            System.out.println("Invalid choice. Please run the program again.");
        }
        
        user_input.close();
    }
}
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        
        /* take user input */
        Scanner user_input = new Scanner(System.in);
        
        /*prompt user to enter a value */
        System.out.print("Enter temperature in Celsius: ");
        double celsius = user_input.nextDouble();
        
        /*covert the value into fahreneit */
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Temperature in Fahrenheit is: " + fahrenheit);
        
        user_input.close();
    }
}
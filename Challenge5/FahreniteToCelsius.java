
import java.util.Scanner;

public class FahreniteToCelsius {

    public static void main(String[] args) {
        System.out.println("\nWelcome to Temperature Converter from fahrenite to Celsius\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the Temperature in Fahrenite: ");
        float f = input.nextFloat();
        float celsius = (f - 32) * 5 / 9;
        System.out.println("The Conversion from fahreite to Celcius is: " + celsius + "C");

    }
}

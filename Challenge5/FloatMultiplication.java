
import java.util.Scanner;

public class FloatMultiplication{ 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nFloat Multiplicaton\n");
        System.out.print("Please enter the first number : ");
        double Firstnumber = input.nextDouble();
        System.out.print("Please enter the second number : ");
        double Secondnumber = input.nextDouble();
        
        double multiplication = Firstnumber * Secondnumber;
        System.out.println("\nThe Multiplication of two float number is : " + multiplication);


    }
}
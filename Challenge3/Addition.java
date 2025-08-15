
import java.util.Scanner;

public class Addition {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO BASIC CALCULATOR!");
        System.out.print("Please Enter the First Numner: ");
        int firstNumber = input.nextInt();
        System.out.print("Please Enter the Second Number: ");
        int secondNumber = input.nextInt();
        int sum = firstNumber + secondNumber;
        System.out.println("The sum of two Numbers is: " + sum);
    }
}

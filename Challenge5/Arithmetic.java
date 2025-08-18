
import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("WELCOME TO BASIC CALCULATOR");
        System.out.print("Please enter the value of a = ");
        int a = input.nextInt();
        System.out.print("Please enter the value of b = ");
        int b = input.nextInt ();

        int sum = a + b;
        int diff = a - b;
        int mul = a * b;
        int div = a / b;
        int mod = a % b;
        System.out.print("sum is = " + sum + "\ndiff is = " + diff + "\nMul is = " + mul + "\ndiv is = " + div + "\nmod is = " + mod);
    }
}
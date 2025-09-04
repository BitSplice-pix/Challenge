
import java.util.Scanner;

public class SumOfDigits{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n Welcome to Sum of the Digits\n");
        System.out.print("Please Enter Your Number: ");
        int num = input.nextInt();
        int sum = sumofdigits(num);
        System.out.println("Sum of Digits is: " + sum);

    }
    
    public static int sumofdigits( int num ) {
        int sum = 0;
        while ( num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

}
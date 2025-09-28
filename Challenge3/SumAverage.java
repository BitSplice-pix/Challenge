
import java.util.Scanner;

public class SumAverage {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("\nAnsari Salman\n");
        System.out.print("Please Enter the Value of a: ");
        int a = input.nextInt();
        System.out.print("Please Enter the Value of b: ");
        int b = input.nextInt();
        System.out.print("Please Enter the Value of c: ");
        int c = input.nextInt();
        int sum = a + b + c;
        double avg = (double) sum / 3;
        System.out.println("The Sum of Three Numunber is: " + sum + " And the Average of Three Number is: " + avg);
    }
}

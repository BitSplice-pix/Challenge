
import java.util.Scanner;

public class Oddsum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nWelcome to odd Calculator\n");
        System.out.print("Please Enter your Number: ");
        int num = input.nextInt();
        int sum = oddsum(num);
        System.out.println("OddSum till " + num + " is " + sum);
    }

    public static int oddsum(int num) {
        int sum = 0;
        int i = 1;
        while (i <= num) {
            sum += i;
            i += 2;
        }
        return sum;
    }
}


import java.util.Scanner;

public class BitwiseOddEven {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Odd/Even Calculator\n");
        System.out.print("Please Enter Your Number: ");
        int num = input.nextInt();

        if ((num & 1) == 1) {
            System.out.println("The Entered Number is ODD");
        } else {
            System.out.println("The Entered Number is Even");
        }

    }
}


import java.util.Scanner;

public class GCD { //Greatest Common Divisor

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n WELCOME to GCD\n");
        System.out.print("Please Enter Your First Number: ");
        int first = input.nextInt();
        System.out.print("Please Enter Your Second Number: ");
        int second = input.nextInt();
        int gcd = GCD(first, second);
        System.out.println("The GCD of two Numbers is " + gcd);

    }

    public static int GCD(int num1, int num2) {
        int gcd = 1;
        int i = 1;
        int least = least(num1, num2);
        while (i <= least) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
            i++;
        }
        return gcd;

    }

    public static int least(int num1, int num2) {
        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }

}

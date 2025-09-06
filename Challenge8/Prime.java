
import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nWelcome to Prime Inspector\n");
        System.out.print("Please Enetr Your Number: ");
        int num = input.nextInt();
        boolean prime = Prime(num);
        if (prime) {
            System.out.println(num + " is Prime Number");
        } else {
            System.out.println(num + " is Not a Prime Number");
        }

    }

    public static boolean Prime(int num) {
        int i = 2;
        while (i < num) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return true;

    }
}

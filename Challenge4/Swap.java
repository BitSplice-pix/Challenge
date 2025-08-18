
import java.util.Scanner;

class Swap {

    public static void main(String[] args) {
        System.out.println("Welcome to the Swap Program!\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first number (x): ");
        int x = input.nextInt();
        System.out.print("Please enter the second number (y): ");
        int y = input.nextInt();

        int z = x;
        x=y;
        y=z;
        System.out.print("Swapping Done...\n");
        System.out.print("Values after swapping x = " + x + " and y = " + y);
    }
}
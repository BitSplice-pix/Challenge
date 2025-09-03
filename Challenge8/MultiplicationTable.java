
import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nWELCOME TO MULTIPLICATION WORLD: \n");
        System.out.print("Please Enter Your Number: ");
        int num = input.nextInt();
        printMultiplicationTable(num);

    }

    public static void printMultiplicationTable(int num) {

        int i = 1;
        while (i <= 10) {
            System.out.println(num + " X " + i + " = " + (num * i));
            i++;
        }

    }

}


import java.util.Scanner;

public class LCM {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n Welcome to LCM \n");
        System.out.print("Please Enter Your First Number: ");
        int first = input.nextInt();
        System.out.print("Please Enter Your Second Number: ");
        int second = input.nextInt();
        int lcm = lcm(first, second);
        System.out.println("LCM of Two number is: " + lcm);

    }

    public static int lcm(int first, int second) {
        int i = 1;
        while (true) // ( i<=second ) 
        {
            int factor = first * i;
            if (factor % second == 0) {
                return factor;
            }
            i++;
        }
    }

}
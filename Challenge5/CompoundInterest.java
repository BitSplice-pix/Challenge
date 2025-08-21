import java.util.Scanner;

public class CompoundInterest{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n Welcome to Compund Interest Calculator\n");
        System.out.print("Please Enter your Principle amount Rs: ");
        int p = input.nextInt();
        System.out.print("Please Enter your Rate of interest: ");
        float r = input.nextFloat();
        System.out.print("Please Enter the Time: ");
        float t = input.nextFloat();

        double compoundinterest  = p * Math.pow(( 1 + r/100),t);
        System.out.println("\n\nYour Simple Interest is Rs " + compoundinterest);
    }
}
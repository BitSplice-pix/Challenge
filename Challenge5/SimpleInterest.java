import java.util.Scanner;

public class SimpleInterest{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n Welcome to Simple Interest Calculator\n");
        System.out.print("Please Enter your Principle amount Rs");
        int p = input.nextInt();
        System.out.print("Please Enter your Rate of interest: ");
        float r = input.nextFloat();
        System.out.print("Please Enter the Time: ");
        float t = input.nextFloat();

        float SimpleInterest  = (p * r * t)/100;
        System.out.println("\n\nYour Simple Interest is Rs " + SimpleInterest);
    }
}
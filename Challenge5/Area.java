import java.util.Scanner;

public class Area{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nCalculating the Area of Triangle\n");
        System.out.print("Please Enter the Base of Triangle in cms: ");
        double Base = input.nextDouble();
        System.out.print("Please Enter the Height of triangle in cms: ");
        double Height = input.nextDouble();

        double area  = (Base * Height)/2;
        System.out.println("The Area of Triangle is: " + area + "cms2");
    }
}
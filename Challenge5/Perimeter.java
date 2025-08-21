
import java.util.Scanner;

public class Perimeter{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nClaculating the Perimeter of rectangle\n");
        System.out.print("Please Enter all 4 sides in cms: ");
        double Firstside = input.nextDouble();
        double Secondside = input.nextDouble();
        double Thirdside = input.nextDouble();
        double Fouthside = input.nextDouble();
        double perimeter = Firstside + Secondside + Thirdside + Firstside;
        System.out.println("The Perimeter of Rectangle is: " + perimeter + "cms");
    }
}
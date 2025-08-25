
import java.util.Scanner;

public class LeapYear{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Year You Want to Check: ");
        int year = input.nextInt();

        if( year % 400 == 0 || (year % 4 == 0 && year % 100 != 0) ){
            System.out.println("\nThe Entered Year is a Leap Year\n");
        }else {
            System.out.println("\nThe Entered Year is Not a Leap Year\n");
        }
    }
}
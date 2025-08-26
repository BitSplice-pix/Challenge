
import java.util.Scanner;

public class Grade{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nWelcome to Grade Calculator\n");
        System.out.print("Please Enter Your Percentage: ");
        float perc = input.nextFloat();
        
        if( perc >= 90 ) {
            System.out.println(" You Got A Grade ");
        } else if (perc >= 75 ){
            System.out.println(" You Got B Grade ");
        }else if(perc >= 60 ){
            System.out.println(" You Got C Grade ");
        } else if(perc >= 30) {
            System.out.println(" You Got D Grade ");
        }else {
            System.out.println(" You Got Fail! ");
        }


    }
}
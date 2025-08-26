
import java.util.Scanner;

public class AgeGroup{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n Welcome\n");
        System.out.print("Please Enter Your Age: ");
        int age = input.nextInt();

        if ( age <= 13 ){
            System.out.println(" You are a Child ");
        }else if( age <= 20){
            System.out.println(" You are an teen ");
        }else if( age <= 60 ) {
            System.out.println(" You are a Adult ");
        }else {
            System.out.println(" You are a Senior Citizen ");
        }
    }
}
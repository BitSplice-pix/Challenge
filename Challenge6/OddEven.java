
import java.util.Scanner;

public class OddEven{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n Welcome to odd even Calculator \n");

        System.out.print("Please Enter the Number: ");

        int num = input.nextInt();

        if (num % 2 == 0){
            System.out.println("The Enter Number is Even ");
        } else{
            System.out.println("The Enter Number is Odd ");
        }


    }
}
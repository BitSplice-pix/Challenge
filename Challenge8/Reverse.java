
import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Reverse Number!!");
        System.out.print("Please Enter Your Number: ");
        int num = input.nextInt();
        int reverse = Reverse(num);
        System.out.println("The reverse of your Number is: " + reverse);
    }

    public static int Reverse(int num) {
        int newNum = 0;
        while (num > 0) {
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }
        return newNum;
    }
}

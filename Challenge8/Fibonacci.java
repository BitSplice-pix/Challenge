
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to Fibonacci Series!");
        System.out.print("Please Enter the Number Upto You Want to print the Series: ");
        int num = input.nextInt();
        System.out.print("The Fibonacci Series is ");
        Fibonacci(num);

    }
    public static void  Fibonacci( int num){
        if ( num < 0) return;
        System.out.print("0 ");
        if ( num == 0 ) return ;
        System.out.print("1 ");

        int first = 0 , second = 1 ;
        while ( first + second <= num ) {
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;

        }
    }

}
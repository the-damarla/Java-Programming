package Basics;
import java.util.*;
public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");int num = sc.nextInt();
        if(CheckPrime(num))System.out.print("Given number is a prime number");
        else System.out.print("Given number is not a prime number");
    }

    private static boolean CheckPrime(int num) {
        if(num < 2)return false;
        if(num < 4)return true;
        if(num % 2 == 0 || num % 3 == 0)return false;
        for(int i=5;i*i<=num;i+=6)
            if(num % i == 0 || num %(i+2) == 0)return false;
        return true;
    }
}

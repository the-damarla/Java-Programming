package Basics;
import java.util.*;
public class NumberAsSumOfTwoPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");int num = sc.nextInt();
        boolean flg = false;
        for(int i=1;i<=num/2;i++)
        {
            if(PrimeCheck(i))
            {
                if(PrimeCheck(num-i))
                {
                    System.out.print(num + " Can be expressed as a sum of " + i + " , " + (num-i) + "\n");
                    flg = true;
                }
            }
        }
        if(!flg)System.out.print("Number cannot be expressed as sum of any primes");
    }

    private static boolean PrimeCheck(int num) {
        if(num < 2)return false;
        if(num < 4)return true;
        if(num%2 == 0 || num%3 == 0)return false;
        for(int i=5;i*i<=num;i+=6)
            if(num%i == 0 || num%(i+2) == 0)return false;
        return true;
    }
}

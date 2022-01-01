package Recursions;
import java.util.*;

public class ReverseTheGivenNumberAndSumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");int num = sc.nextInt();
        System.out.print("Number After reversing : " + getReverse(num,0,0) + "\n");
        System.out.print("Sum of digits in the given number is : " + getSumOfDigits(num,0));
    }

    private static int getSumOfDigits(int num, int sum) {
        if(num == 0)return sum + num%10;
        return getSumOfDigits(num/10,sum+num%10);
    }

    private static int getReverse(int num, int rem, int sum) {
        if(num == 0) return sum*10+rem;
        return getReverse(num/10,num%10,sum*10+rem);
    }
}

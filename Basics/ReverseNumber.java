package Basics;
import java.util.*;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");int num = sc.nextInt();
        System.out.print("Reverse of the given number is : " + Rev(num));
    }

    static int Rev(int num) {
        int sum = 0;
        while(num > 0)
        {
            sum = ((sum*10) + (num%10));
            num /= 10;
        }
        return sum;
    }
}

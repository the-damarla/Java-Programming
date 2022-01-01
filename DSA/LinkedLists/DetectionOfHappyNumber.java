package DSA.LinkedLists;
import java.util.*;

/*
Input: n = 19
        Output: True
        19 is Happy Number,
        1^2 + 9^2 = 82
        8^2 + 2^2 = 68
        6^2 + 8^2 = 100
        1^2 + 0^2 + 0^2 = 1
        As we reached to 1, 19 is a Happy Number.

        Input: n = 20
        Output: False
*/

public class DetectionOfHappyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to test whether it is a Happy Number or Not : ");int num = sc.nextInt();
        int slow,fast;slow = fast = num;
        do {
            slow = squareOfDigits(slow);
            fast = squareOfDigits(squareOfDigits(fast));
        }while (slow != fast);

        if(slow == 1) System.out.println("NUMBER IS A HAPPY NUMBER");
        else System.out.println("NUMBER IS NOT A HAPPY NUMBER");
    }

    private static int squareOfDigits(int num)
    {
        int sqr = 0;
        while (num > 0)
        {
            sqr += (num % 10) * (num % 10);
            num /= 10;
        }
        return sqr;
    }
}

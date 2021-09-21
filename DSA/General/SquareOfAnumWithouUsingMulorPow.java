package DSA.General;
import java.util.*;

/*
 *  TestCase : i/p ---> 25   i/p ---> 5     i/p ---> 6   i/p ---> 7
 *             o/p ---> 625  o/p ---> 25    o/p ---> 36  o/p ---> 49
*/

public class SquareOfAnumWithouUsingMulorPow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its Square : ");int num = sc.nextInt();
        int sum = 0, odd = 1;
        for(int i=1;i<=num;i++)
        {
            sum += odd;
            odd += 2;
        }
        System.out.print("Square of the given number : " + sum);
    }
}

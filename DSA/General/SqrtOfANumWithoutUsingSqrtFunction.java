package DSA.General;
import java.util.*;

/*
* TestCase : i/p ---> 4   i/p ---> 5   i/p ---> 25  i/p ---> 17
*            o/p ---> 2   o/p ---> 2   o/p ---> 5   o/p ---> 4
*/

public class SqrtOfANumWithoutUsingSqrtFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its Square Root : ");int num = sc.nextInt();
        System.out.print("The Square Root of given number is : " + GetSqrt(num));
    }

    private static int GetSqrt(int num) {
        long sum = 1;
        long odd = 1;
        int c = 0;
        if(num == 1)return 1;
        while(sum <= num)
        {
            odd += 2;
            sum += odd;
            c++;
        }
        return c;
    }
}

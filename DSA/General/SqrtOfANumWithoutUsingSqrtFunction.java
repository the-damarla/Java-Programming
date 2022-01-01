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
        System.out.print("The Square Root of given number is : " + getSqrt(num) + "\n");
        System.out.print("Enter the Precision you want : ");int p = sc.nextInt();
        System.out.print("The Perfect SquareRoot of given number with given precision is : " + getSqrtWithPrecision(num, p) + "\n");
        System.out.print("The Square Root of " + num + " Using NEWTON RAPHSON METHOD is : " + getSqrtWithNRM(num));
    }

    private static double getSqrtWithNRM(int num) {
        double root;
        double x = num;
        while (true)
        {
            root = 0.5 * (x + (num/x));         //x is the number of our choice
            if(Math.abs(root - x) < 0.5)break;
            x = root;
        }
        return root;
    }

    private static double getSqrtWithPrecision(int num, int p) {
        int s = 0;
        int e = num;
        double root = 0.0;
        while (s <= e)                      //Binary Search if the number is Perfect Square Root
        {
            int m = s + (e - s) / 2;
            if(m * m == num)return m;
            if(m * m > num) e = m-1;
            else s = m+1;
        }
        double incr = 0.1;                  //This will work for numbers other than Perfect Square Roots
        for(int i=0;i<p;i++)                //This runs for number of Precision times
        {
            while (root * root <= num)      //This will get the Sqrt For the No. of Precision Times
            {
                root += incr;
            }
            root -= incr;
            incr /= 10;
        }
        return root;
    }

    private static int getSqrt(int num) {
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

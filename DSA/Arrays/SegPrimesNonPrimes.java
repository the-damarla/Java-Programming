package DSA.Arrays;
import java.util.*;

/*
* Test Cases :    i/p ---> 2, 9, 5, 3, 14, 80, 17
*                 o/p ---> [2, 5, 3, 17, 14, 80, 9]
 */

public class SegPrimesNonPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> ar = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int x = sc.nextInt();ar.add(x);
        }
        int c = 0;
        for(int i=0;i<n;i++)
        {
            if(CheckPrime(ar.get(i)))
            {
                int temp = ar.get(i);
                ar.set(i,ar.get(c));
                ar.set(c,temp);
                c++;
            }
        }
        System.out.print(ar);
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

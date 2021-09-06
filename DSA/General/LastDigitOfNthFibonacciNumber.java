package DSA.General;
import java.util.*;

/*
* TestCase : i/p ---> 5   i/p ----> 120  i/p ---> 154
*            o/p ---> 5   o/p ----> 0    o/p ---> 7
*      intuition ---> After 60 digits os fibonacci the last digits keep repeating
*                     So we will be storing last digits till 60 fibonacci and after that
*                     whatever the number(how big won't matter) we will be returning the
*                     number at num%60.
*/

public class LastDigitOfNthFibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number : ");int num = sc.nextInt();
        System.out.print("Last digit of " + num + "th fibonacci is : " + GetLastDigit(num));
    }

    private static Long GetLastDigit(int num) {
        ArrayList<Long> ar = new ArrayList<>();
        ar.add(0L);ar.add(1L);
        for(int i=2;i<60;i++)ar.add(i,((ar.get(i-1) + ar.get(i-2))%10));
        //for(Long x:ar)System.out.print(x + " ");
        return ar.get(num%60);
    }
}

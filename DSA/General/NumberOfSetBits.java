package DSA.General;
import java.util.*;

/*
*  TestCase : i/p ---> 11   i/p ---> 7  i/p ---> 4
*             o/p ---> 3    o/p ---> 3  o/p ---> 1
*/

public class NumberOfSetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");int num = sc.nextInt();
        System.out.println("Binary number is : " + Integer.toBinaryString(num));
        int c= 0;
        while(num > 0)
        {
            c++;
            num &= (num-1);
        }
        System.out.print("Number of set bits in the given number are : " + c);
    }
}

package BitWise;
import java.util.*;

/*
*   Test Cases : i/p ---> Enter a number  : 2           i/p ---> Enter a number  : 5
                 o/p ---> Given number is even          o/p ---> Given number is ODD

                 * Here Intuition is, every even number ends with '0' (LSB - Least Significant Bit)in binary system
                 * So if we do AND operation with 1 then, if we have 0 as o/p then given number if Even else Odd
                 * 5 --> 1 0 1            4 --> 1 0 0
                 * 1 --> 0 0 1            1 --> 0 0 1
                 * and-> 0 0 1 ---> 1       --> 0 0 0 ---> 0
*/

public class OddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number  : ");int n = sc.nextInt();
        if ((n & 1) == 0) System.out.print("Given number is even");
         else System.out.print("Given number is ODD");
    }
}

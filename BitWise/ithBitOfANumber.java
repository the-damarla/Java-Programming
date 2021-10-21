package BitWise;
import java.util.*;

/*
*   Test Case : i/p ---> num : 27 pos : 3
*               o/p ---> 0
*       Explanation ---> binary Form of 27 -> 11011 the bit at 3rd pos(from right) is 0

        * Example : number ---> 43 pos ---> 4
        *           mask ---> 0 0 1 0 0 0 -> this is left shift of 1 by numOf positions
        *        bin of 43 -> 1 0 1 0 1 1
        *     And Operation > 0 0 1 0 0 0 -> right shift of o/p by numOf positions
*/

public class ithBitOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");int n = sc.nextInt();
        System.out.print("binary of " + n + " is : " + Integer.toBinaryString(n));
        System.out.print("\nEnter position of the bit you want : ");int pos = sc.nextInt();
        System.out.print("Mask is : " + Integer.toBinaryString(1 << (pos-1)));
        System.out.print("\nThe bit at pos " + pos + " is : " + ((n & (1 << pos-1)) >> pos-1));
    }
}

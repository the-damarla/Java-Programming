package BitWise;
import java.util.*;

/*

Example 1:
Input: n = 5
Output: true
Explanation: The binary representation of 5 is: 101

Example 2:

Input: n = 7
Output: false
Explanation: The binary representation of 7 is: 111.

Example 3:

Input: n = 11
Output: false
Explanation: The binary representation of 11 is: 1011.

Example 4:

Input: n = 10
Output: true
Explanation: The binary representation of 10 is: 1010.

Example 5:

Input: n = 3
Output: false


*/

public class BinaryNumberWithAlternatingBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");int n = sc.nextInt();
        System.out.print("Binary representation of " + n + " is " + Integer.toBinaryString(n));
        System.out.print("\nHave Alternate bits Or Not ---> " + getAnswer(n));
    }

    private static boolean getAnswer(int n) {
        boolean flg = (n&1) == 1 ? true : false;
        while (n > 0)
        {
            if(flg && (n & 1) == 1)n >>= 1;
            else if(!flg && (n & 1) == 0)n >>= 1;
            else return false;
            flg = !flg;
        }
        return true;
    }
}

package BitWise;
import java.util.*;

/*
     Test Case  :    i/p ---> base : 3, exponent : 4
                     o/p ---> 81

    Intuition   :    we will be taking that exponent in a binary format
                     So 4 will be considered as 100, we will be continuously multiplying the base
                     and when there is a set bit, at that position will be multiplying base with the current answer.

    Explanation :  * We will be taking every number in its Binary Format and Calculate its value with base value
                   * Example -> number --> 4 Base --> 3   number Binary Format is 1 0 0
                   * 1 0 0 ---> as (1 0 0 & 0 0 1) -> 0 ans won't get updated,  1 0 0 >> 1 --> 1 0, base becomes 3 * 3 = 9
                   * 1 0 ---> as (1 0 & 0 1) -> 0 ans won't get updated, 1 0 >> 1 --> 1, base 9 * 9 = 81
                   * 1 ---> as (1 & 1) -> 1 ans becomes 1 * base i.e, 1 * 81, 1 >> 1 --> 0 base = 81 * 81
                   * 0 while loop gets terminated ans will be returned

         NOTE  :   >> -> LeftShift
                   0 0 1 -> binary format of 1
*/

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base : ");int base = sc.nextInt();
        System.out.print("Enter the exponent : ");int exp = sc.nextInt();
        System.out.print("When " + base + " is raised to " + exp + " ---> " + getPower(base, exp));
    }

    private static int getPower(int base, int exp) {
        int ans = 1;
        while (exp > 0)
        {
            if((exp & 1) == 1) ans *= base;
            base *= base;
            exp >>= 1;
        }
        return ans;
    }
}

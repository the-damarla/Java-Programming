package BitWise;
import java.util.*;

/*
        Test Case :  i/p ---> Base : 2, number : 10    i/p ---> Base : 3, number : 4
                     o/p ---> 1024                    o/p ---> 81

                   * We will be taking every number in its Binary Format and Calculate its value with base value
                   * Example -> number --> 4 Base --> 3   number Binary Format is 1 0 0
                   * 1 0 0 ---> as (1 0 0 & 0 0 1) -> 0 ans won't get updated,  1 0 0 >> 1 --> 1 0, base becomes 3 * 3 = 9
                   * 1 0 ---> as (1 0 & 0 1) -> 0 ans won't get updated, 1 0 >> 1 --> 1, base 9 * 9 = 81
                   * 1 ---> as (1 & 1) -> 1 ans becomes 1 * base i.e, 1 * 81, 1 >> 1 --> 0 base = 81 * 81
                   * 0 while loop gets terminated ans will be returned

         NOTE : >> -> LeftShift
                0 0 1 -> binary format of 1
*/

public class MagicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base : ");int base = sc.nextInt();
        System.out.print("Enter a number : ");int num = sc.nextInt();
        System.out.print("The magic number is : " + getMagicNumber(num, base));
    }

    private static int getMagicNumber(int num, int base) {
        int ans = 1;
        while (num > 0)
        {
            if((num & 1) == 1)ans *= base;
            base *= base;
            num >>= 1;
        }
        return ans;
    }
}

package BitWise;
import java.util.*;

/*
        Test Case :  i/p ---> Base : 5, number : 3    i/p ---> Base : 3, number : 4
                     o/p ---> 30                      o/p ---> 81

                   * We will be taking every number in its Binary Format and Calculate its value with base value
                   * Example -> number --> 3 Base --> 5   number Binary Format is 1 1
                   * 1 1 ---> as (1 1 & 0 0 1) -> 1 ans becomes ans+base = 5,  1 1 >> 1 --> 1 , base becomes 5 * 5 = 25
                   * 1 ---> as (1 & 1) -> 1 ans becomes ans+base = 30, 1 >> 1 --> 0, base 25 * 5 = 125
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
        int ans = 0;
        while (num > 0)
        {
            if((num & 1) == 1)ans += base;
            base *= base;
            num >>= 1;
        }
        return ans;
    }
}

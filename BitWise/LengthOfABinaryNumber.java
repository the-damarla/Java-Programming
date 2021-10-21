package BitWise;
import java.util.*;

/*
        Test Case :  i/p ---> 42
                     o/p ---> 6

              Intuition of method 1 is ---> right shifting the bits by one place till we make the Zero.

              Intuition of method 2 is ---> Logarithmic value of given number to the base 2(Binary) + 1
                                            gives us the length of the number in binary form
                                          * This method can also be applied to any form of System, just change the
                                            base value to the respective System.
*/

public class LengthOfABinaryNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number  : ");int num = sc.nextInt();
        System.out.print("Number of digits in given number : " + getMethodTwoAnswer(num, 10) + " ---> Time Complexity : O(1)\n");
        System.out.print("Binary Form of " + num + " ---> " + Integer.toBinaryString(num) + "\n");
        System.out.print("Method 1 Answer : " + getMethodOneAnswer(num) + " ---> Time Complexity : O(Length)\n");
        System.out.print("Method 2 Answer : " + getMethodTwoAnswer(num, 2) + " ---> Time Complexity : O(1)\n");
    }

    private static int getMethodTwoAnswer(int num, int base) {
        return (int)(Math.log(num)/Math.log(base)) + 1;
    }

    private static int getMethodOneAnswer(int num) {
        int c = 0;
        while (num > 0)
        {
            c++;num >>= 1;
        }
        return c;
    }


}

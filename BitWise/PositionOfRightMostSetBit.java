package BitWise;
import java.util.*;

/*
*       Test Case : i/p ---> 12
*                   o/p ---> 3
*           Explanation ---> So Binary form of 12 -> 1100 and negative Binary Form of 12 is -> 0100
*                               1 1 0 0 --> 12
*                               0 1 0 0 --> -12
*                               0 1 0 0 --> And operation (RightMost Set bit is at 3rd position)
*/

public class PositionOfRightMostSetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");int x = sc.nextInt();
        System.out.print("Binary Form of Given number : " + Integer.toBinaryString(x) + "\n");
        System.out.print("negative form of given number in binary Form : " + Integer.toBinaryString(-x) + "\n");
        x &= -(x);
        int c = 0;
        while (x > 0)
        {
            c++;
            x >>= 1;
        }
        System.out.print("Right most Set bit is at : " + c);
    }
}

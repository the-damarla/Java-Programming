package BitWise;
import java.util.*;
import static java.lang.System.exit;
/*
*   Test Case :    i/p & o/p --->

                            Enter '0' to SetBit at Given Position to 1
                            Enter '1' to reset bit at given position to 1
                            Enter '2' to exit the loop

                            Enter data : 1

                            enter a number : 53
                            Binary form of given number is : 110101
                            Enter position to make a bit set bit : 5
                            mask : 11111111111111111111111111101111
                            After setting bit at 5 : 100101
                            Changed Number is : 37

                            Enter '0' to SetBit at Given Position to 1
                            Enter '1' to reset bit at given position to 1
                            Enter '2' to exit the loop

                            Enter data : 0

                            enter a number : 23
                            Binary form of given number is : 10111
                            Enter position to make a bit set bit : 3
                            mask : 100
                            After setting bit at 3 : 10111
                            Changed Number is : 23

*/
public class SettingAndResettingBitByPos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            System.out.print("Enter \'0\' to SetBit at Given Position to 1\n" +
                    "Enter \'1\' to reset bit at given position to 1\n" +
                    "Enter \'2\' to exit the loop\n");
            System.out.print("Enter data : ");
            int n = sc.nextInt();
            switch (n) {
                case 0:
                    setBitAtPosToOne();
                    System.out.print("\n");
                    break;
                case 1:
                    resetBitAtPosToOne();
                    System.out.print("\n");
                    break;
                case 2:
                    exit(0);
                default:
                    System.out.print("Enter valid number");
            }
        }
    }

    private static void resetBitAtPosToOne() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");int n = sc.nextInt();
        System.out.print("Binary form of given number is : " + Integer.toBinaryString(n));
        System.out.print("\nEnter position to make a bit set bit : ");int pos = sc.nextInt();
        System.out.print("mask : " + Integer.toBinaryString(~(1 << pos-1)));
        System.out.print("\nAfter setting bit at " + pos + " : " + Integer.toBinaryString(n & ~(1 << pos-1)));
        System.out.print("\nChanged Number is : " + (n & ~(1 << pos-1)) + "\n");
    }

    private static void setBitAtPosToOne() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");int n = sc.nextInt();
        System.out.print("Binary form of given number is : " + Integer.toBinaryString(n));
        System.out.print("\nEnter position to make a bit set bit : ");int pos = sc.nextInt();
        System.out.print("mask : " + Integer.toBinaryString(1 << pos-1));
        System.out.print("\nAfter setting bit at " + pos + " : " + Integer.toBinaryString(n | (1 << pos-1)));
        System.out.print("\nChanged Number is : " + (n | (1 << pos-1)) + "\n");
    }
}

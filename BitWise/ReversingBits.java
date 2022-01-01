package BitWise;
import java.util.*;

public class ReversingBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");int num = sc.nextInt();
        System.out.print("binary Format of given number is : " + Integer.toBinaryString(num) + "\n");
        int reverse = 0;
        while (num > 0)
        {
            reverse <<= 1;
            reverse |= (num & 1);
            num >>= 1;
        }
        System.out.print("Reversed bits gives number as : " + reverse + " And Binary Format is : " + Integer.toBinaryString(reverse));
    }
}

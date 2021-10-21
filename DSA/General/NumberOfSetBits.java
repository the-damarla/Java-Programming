package DSA.General;
import java.net.SocketOption;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;

/*
*  TestCase : i/p ---> 11   i/p ---> 7  i/p ---> 4
*             o/p ---> 3    o/p ---> 3  o/p ---> 1
*/

public class NumberOfSetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");int num = sc.nextInt();
        System.out.println("Binary number is : " + Integer.toBinaryString(num));
        System.out.print("number of SetBits in method1 ---> " + getMethod1(num) + "\n");
        System.out.print("number of SetBits in method2 ---> " + getMethod2(num) + "\n");
    }

    private static int getMethod2(int num) {
        int c = 0;
        while (num > 0)
        {
            if((num & 1) == 1)c++;
            num >>= 1;
        }
        return c;
    }

    private static int getMethod1(int num) {
        int c= 0;
        while(num > 0)
        {
            c++;
            num &= (num-1);
        }
        return c;
    }
}

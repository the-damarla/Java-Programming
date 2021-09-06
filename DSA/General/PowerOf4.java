package DSA.General;
import java.util.*;

/*
 * TestCase : i/p ---> 16   i/p ---> 20  i/p ---> 64
 *            o/p ---> Yes  o/p ---> No  o/p ---> Yes
*/

public class PowerOf4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");int num = sc.nextInt();
        while(num > 1)
        {
            if(num % 4 != 0)
            {
                System.out.print("Given number is not a power of 4");
                return;
            }
            num /= 4;
        }
        if(num == 1)System.out.print("Given number is power of 4");
    }
}

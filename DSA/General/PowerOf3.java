package DSA.General;
import java.util.*;

/*
* TestCase : i/p ---> 27   i/p ---> 5    i/p ---> 9
*            o/p ---> Yes  o/p ---> No   o/p ---> yes
*/

public class PowerOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");int num = sc.nextInt();
        while(num > 1)
        {
            if(num % 3 != 0)
            {
                System.out.print("Given number is not a power of 3");
                return;
            }
            num /= 3;
        }
        if(num == 1)System.out.print("Given number is a Power of 3");
    }
}

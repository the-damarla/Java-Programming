package DSA.General;
import java.util.*;

/*
*  TestCase : i/p ---> 1024   i/p ---> 22  i/p ---> 4
*             o/p ---> Yes    o/p ---> NO  o/p ---> yes
*       Intuition ---> in binary number system, if the number is  power of 2 then number of set bits are 1
*                      So binary AND operation with its previous number give "0"
*                      ex : 4 ---> 100   3 ---> 011
*                                  100 & 011 ---> 0
*/

public class PowerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check whether it is power of 2 or not : ");int num = sc.nextInt();
        if((num&(num-1)) == 0)System.out.print("Yes the given number is Power of 2");
        else System.out.print("No the Given number is not a power of 2");
    }
}

package Basics;
import java.util.*;
public class GCDofTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");int one = sc.nextInt();
        System.out.print("Enter another number : ");int two = sc.nextInt();
        System.out.print("GCD of given numbers is : " + GCD(one,two));
    }

    static int GCD(int one, int two) {
        if(one == 0)return two;
        if(two == 0)return one;
        if(one > two)return GCD((one-two),two);
        return GCD((two-one),one);
    }
}

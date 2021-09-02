package com.company;
import java.util.*;
public class LCMofTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");int a = sc.nextInt();
        System.out.print("Enter another number : ");int b = sc.nextInt();
        System.out.print("LCM of given numbers is : " + (a*b)/GCD(a,b));
    }

    static int GCD(int a, int b) {
        if(a == 0)return b;
        if(b == 0)return a;
        if(a > b)return GCD((a-b),b);
        return GCD((b-a),a);
    }
}

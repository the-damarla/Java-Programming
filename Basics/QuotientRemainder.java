package com.company;
import java.util.*;
public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        System.out.print("Enter another number : ");
        int b = sc.nextInt();
        System.out.println("Remainder of two numbers is : " + (a%b));
        System.out.println("Quotient of two numbers is : " + (a/b));
    }
}

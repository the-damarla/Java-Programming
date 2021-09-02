package com.company;
import java.util.*;
public class FactorialOfTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number  : ");int num = sc.nextInt();
        long res = getFact(num);
        System.out.print("Factorial of " + num + " is : " + res);
    }

    private static long getFact(int num) {
        if(num <= 1)return 1;
        long mul = 1;
        for(long i=1;i<=num;i++)mul *= i;
        return mul;
    }
}

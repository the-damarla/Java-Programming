package com.company;
import java.util.*;
public class PrimeBetweenIntervals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter start range : ");int start = sc.nextInt();
        System.out.print("Enter end range : ");int end = sc.nextInt();
        for(int i=start;i<=end;i++)
        {
            if(CheckPrime(i))System.out.print(i + " ");
        }
    }

    private static boolean CheckPrime(int num) {
        if(num < 2)return false;
        if(num < 4)return true;
        if(num%2 == 0 || num%3 == 0)return false;
        for(int i=5;i*i<=num;i+=6)
            if(num%i == 0 || num%(i+2) == 0)return false;
        return true;
    }
}

package com.company;
import java.util.*;
public class NumberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");int num = sc.nextInt();
        int c = 0;
        while(num > 0)
        {
            c++;
            num /= 10;
        }
        System.out.print("Number of digits in the given number are : " + c);
    }
}

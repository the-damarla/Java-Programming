package com.company;
import java.util.*;
public class BinToDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary string : ");String s = sc.nextLine();
        System.out.print("Decimal number of given binary string is : " + ConvertToDec(s));
        System.out.print("\nAnother way is ---> " + Integer.parseInt(s,2));
    }

    private static int ConvertToDec(String s) {
        int n = s.length()-1;
        int tot = n;
        int sum = 0;
        while(n >= 0)
        {
            if(s.charAt(n) == '1')
                sum += Pow(2, tot - n);
            n--;
        }
        return sum;
    }

    private static int Pow(int num, int exp) {
        if(exp == 0)return 1;
        return num*Pow(num,exp-1);
    }
}

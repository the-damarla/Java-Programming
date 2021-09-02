package com.company;
import java.util.*;
public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");int num = sc.nextInt();
        System.out.print("Factors of " + num + " : ");
        for(int i=1;i<num;i++)
            if(num%i == 0)System.out.print(i + " ");
    }
}

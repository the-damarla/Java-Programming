package com.company;
import java.util.*;
public class NaturalNumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start range : ");int start = sc.nextInt();
        System.out.print("Enter end range : ");int end = sc.nextInt();
        int sum = 0;
        for(int i=start;i<=end;i++)
        {
            sum += i;
            System.out.print("at " + i + " the sum is " + sum + "\n");
        }
        System.out.print("Whole sum is " + sum);
    }
}

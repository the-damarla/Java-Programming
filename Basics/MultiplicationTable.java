package com.company;
import java.util.*;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");int num = sc.nextInt();
        for(int i=1;i<11;i++)
        {
            System.out.println(num + " * " + i + " = " + (num*i));
        }
    }
}

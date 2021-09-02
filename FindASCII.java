package com.company;

import java.util.*;

public class FindASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a char : ");char ch = sc.next().charAt(0);
        System.out.println("Ascii value of " + ch + " is " + (int)ch);
    }
}

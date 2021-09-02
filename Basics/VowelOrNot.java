package com.company;

import java.util.Scanner;

public class VowelOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character : ");char ch = sc.next().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')System.out.println("Given Character is Vowel");
        else System.out.println("Given character is not a vowel");
    }
}

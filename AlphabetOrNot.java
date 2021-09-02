package com.company;
import java.util.*;
public class AlphabetOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a character : ");char ch = sc.next().charAt(0);
        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))System.out.println("Given character is alphabet");
        else System.out.println("Given char is not an alphabet");
    }
}

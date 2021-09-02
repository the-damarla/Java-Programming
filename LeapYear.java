package com.company;
import java.util.*;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year : ");int year = sc.nextInt();
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))System.out.println("Given year is leap");
        else System.out.println("Given Year is not a leap year");
    }
}

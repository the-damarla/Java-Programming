package com.company;
import java.util.*;
public class LargestAmongThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");int one = sc.nextInt();
        System.out.print("Enter a number : ");int two = sc.nextInt();
        System.out.print("Enter a number : ");int three = sc.nextInt();
        if(one  > two)
        {
            if(one  > three)System.out.println("one is the greatest");
            else if(three > two)System.out.println("Three is the greatest");
        }
        else
        {
            if(two > three)System.out.println("Two is the greatest");
            else System.out.println("Three is the greatest");
        }
    }
}

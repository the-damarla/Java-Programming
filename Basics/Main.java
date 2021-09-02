package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        //System.out.print("Enter a number : ");
        boolean flag = true;
        while(flag) {
            System.out.print("\nEnter 1 for adding two numbers\nEnter 2 for subtracting two numbers\n" +
                    "Enter 3 for multiplying two numbers" + "\nEnter 4 for diving two numbers\n" +
                    "Enter 5 to stop giving input\nEnter your Choice : ");
            int a = sc.nextInt();
            switch (a) {
                case 1:
                    System.out.print("Enter a number : ");
                    int one = sc.nextInt();
                    System.out.print("enter another number : ");
                    int two = sc.nextInt();
                    SumOfNumbers(one, two);
                    break;
                case 2:
                    System.out.print("Enter a number : ");
                    one = sc.nextInt();
                    System.out.print("Enter another number : ");
                    two = sc.nextInt();
                    Subtraction(one, two);
                    break;
                case 3:
                    System.out.print("Enter a number : ");
                    one = sc.nextInt();
                    System.out.print("enter another number : ");
                    two = sc.nextInt();
                    Multiplication(one, two);
                    break;
                case 4:
                    System.out.print("Enter a number : ");
                    one = sc.nextInt();
                    System.out.print("enter another number : ");
                    two = sc.nextInt();
                    Division(one, two);
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("wrong input please enter right one");
                    break;
            }
        }
    }

    static void Division(int one, int two) {
        System.out.println("Division is : " + (one/two));
    }

    static void Multiplication(int one, int two) {
        System.out.println("Multiplication is : "+ (one*two));
    }

    static void Subtraction(int one, int two) {
        System.out.println("Subtraction is : " +  (one-two));
    }

    static void SumOfNumbers(float a, float b) {
        System.out.println("Sum is : " + (a*b));
    }
}

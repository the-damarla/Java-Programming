package Basics;
import java.util.*;
public class QuadraticRoots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a : ");double a = sc.nextDouble();
        System.out.print("enter a : ");double b = sc.nextDouble();
        System.out.print("enter a : ");double c = sc.nextDouble();
        double disc = ((b*b)-(4*a*c));
        if(disc < 0)System.out.println("Roots a re imaginary");
        else
        {
            double r1,r2;
            r1 = (Math.sqrt(disc) - b)/2*a;
            r2 = -(Math.sqrt(disc) + b)/2*a;
            System.out.println("The roots are : " + r1 + " & " + r2);
        }
    }
}

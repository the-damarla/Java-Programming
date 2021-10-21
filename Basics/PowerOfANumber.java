package Basics;
import java.util.*;
public class PowerOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base number : ");int num = sc.nextInt();
        System.out.print("Enter Exponent : ");int exp = sc.nextInt();
        System.out.print("when " + num + " is raised to " + exp + " --> " + pow(num,exp));
    }

    private static int pow(int num, int exp) {
        if(exp == 0)return 1;
        if(exp < 0)return -1;
        if(exp == 1)return num;
        int mul = 1;
        for(int i=0;i<exp;i++)mul *= num;
        return mul;
    }
}

package Basics;
import java.util.*;
public class FactorialRecur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");int num = sc.nextInt();
        System.out.print("Factorial of " + num + " = " + FactRecur(num,1));
    }

    static int FactRecur(int num,int mul) {
        if(num == 0)return mul;
        return FactRecur(num-1,mul*num);
    }
}

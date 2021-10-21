package Basics;
import java.util.*;
public class PowerOfNumberRecur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter base : ");int base = sc.nextInt();
        System.out.print("enter exponent : ");int exp = sc.nextInt();
        System.out.print("when " + base + " raised to " + exp + " --> " + PowRecur(base,exp));
    }

    static int PowRecur(int base, int exp) {
        if(exp == 0)return 1;
        return base*PowRecur(base,(exp-1));
    }
}

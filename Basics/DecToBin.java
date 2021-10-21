package Basics;
import java.util.*;
public class DecToBin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to see its binary form : ");int x = sc.nextInt();
        System.out.print("Binary form of given number is : " + ConvertDec(x));
    }

    private static String ConvertDec(int x) {
        StringBuilder ans = new StringBuilder();
        while(x > 0)
        {
            ans.append(x % 2);
            x /= 2;
        }
        return Reverse(ans.toString());
    }

    private static String Reverse(String ans) {
        String k = "";
        for(int i=ans.length()-1;i>=0;i--)
            k += ans.charAt(i);
        return k;
    }
}

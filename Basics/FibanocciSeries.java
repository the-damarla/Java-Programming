package Basics;
import java.util.*;
public class FibanocciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = 0;
        int s = 1;
        System.out.print("enter a number : ");int dig = sc.nextInt();
        while (dig > 0)
        {
            int num = f+s;
            System.out.print(f + " ");
            f = s;
            s = num;
            dig--;
        }
    }
}

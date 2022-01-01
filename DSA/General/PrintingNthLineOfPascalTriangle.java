package DSA.General;
import java.util.*;
public class PrintingNthLineOfPascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the line : ");int num = sc.nextInt();
        System.out.print(num + "th line of Pascal triangle is : " );PrintnthLine(num);
        System.out.print("\nThe sum of the " + num + "th line is : " + Math.pow(2,num));
    }

    private static void PrintnthLine(int num) {
        for(Long i=0L;i<=num;i++)
        {
            Long res = 1L;
            Long k = i;
            if(k > num)k = num-k;
            for(Long j=0L;j<k;j++)
            {
                res *= (num-j);
                res /= (j+1);
            }
            System.out.print(res + " ");
        }
    }
}

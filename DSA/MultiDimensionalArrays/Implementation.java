package DSA.MultiDimensionalArrays;
import java.sql.SQLOutput;
import java.util.*;
public class Implementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");int r = sc.nextInt();
        System.out.print("Enter number of cols : ");int c = sc.nextInt();
        int[][] ar = new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print("Enter " + i + "th row " + j + "th col element : ");ar[i][j] = sc.nextInt();
            }
        }
        int n = r;
        System.out.println("" + quotient(ar, n, r, c));
    }

    public static int quotient(int[][] ar, int n, int r, int c) {
        int num = ar[r][c];
        while(num >= 10) num = getReducedForm(num);
        int DigSum = getDiagonalSum(ar,n);
        return DigSum/num;
    }

    private static int getDiagonalSum(int[][] ar, int n) {
        int sum = 0;
        for(int i=0;i<n;i++)
        {
            sum += ar[i][i];
        }
        return sum;
    }

    private static int getReducedForm(int num) {
        int sum = 0;
        while (num > 0)
        {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

}

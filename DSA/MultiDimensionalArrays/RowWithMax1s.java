package DSA.MultiDimensionalArrays;
import java.util.*;

/*
 * TestCase : i/p ---> 1 0 1 0
                       0 1 1 1
                       1 1 1 1
                       0 0 0 1

             o/p ---> Row with max 1s is : 3
*/

public class RowWithMax1s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");int r = sc.nextInt();
        System.out.print("Enter number of cols : ");int c = sc.nextInt();
        int[][] ar = new int[r][c];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
            {
                System.out.print("Enter " + i + "th row " + j + "th Element : ");ar[i][j] = sc.nextInt();
            }
        System.out.print("Given Array is :\n");PrintArray(ar,r,c);
        System.out.print("\nRow with max 1s is : " + GetRowWithMax1s(ar, r, c));
    }

    private static void PrintArray(int[][] ar, int r, int c) {
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)System.out.print(ar[i][j] + " ");
            System.out.println();
        }
    }

    private static int GetRowWithMax1s(int[][] ar, int r, int c) {
        int ind = -1,sum = 0,maxi = 0;
        int row = 0,col = 0;
        while(row < r-1)
        {
            sum = col = 0;
            while(col < c-1)
            {
                sum += ar[row][col];
                col++;
            }
            if(sum > maxi)
            {
                maxi = sum;
                ind = row;
            }
            row++;
        }
        return ind+1;
    }
}

package DSA.MultiDimensionalArrays;
import java.util.*;

/*
 *   TestCase :   i/p ---> 1  2  3  4
 *                         5  6  7  8
 *                         9 10 11 12
 *                        13 14 15 16
 *
 *                o/p ---> Row ZigZag of given matrix is : 1 2 3 4 8 7 6 5 9 10 11 12 16 15 14 13
 *                         Col ZigZag of given matrix is : 1 5 9 13 14 10 6 2 3 7 11 15 16 12 8 4
 */

public class RowColZigZagPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");int r = sc.nextInt();
        System.out.print("Enter number of cols : ");int c = sc.nextInt();
        int[][] ar = new int[r][c];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
            {
                System.out.print("Enter " + i + "th row " + j + "th element : ");ar[i][j] = sc.nextInt();
            }
        System.out.print("Row ZigZag of given matrix is : ");PrintRowZigZag(ar,r,c);System.out.println();
        System.out.print("Col ZigZag of given matrix is : ");PrintColZigZag(ar,r,c);System.out.println();
    }

    private static void PrintColZigZag(int[][] ar, int r, int c) {
        int row = 0,col = 0;
        boolean flag = true;
        while(row < r && col < c)
        {
            if(flag)
            {
                while(row < r - 1)
                {
                    System.out.print(ar[row][col] + " ");
                    row++;
                }
                System.out.print(ar[row][col] + " ");
            }
            else
            {
                while(row > 0)
                {
                    System.out.print(ar[row][col] + " ");
                    row--;
                }
                System.out.print(ar[row][col] + " ");
            }
            col++;
            flag = !flag;
        }
    }

    private static void PrintRowZigZag(int[][] ar, int r, int c) {
        int row = 0,col = 0;
        boolean flag = true;
        while(row < r && col < c)
        {
            if(flag)
            {
                while(col < c - 1)
                {
                    System.out.print(ar[row][col] + " ");
                    col++;
                }
                System.out.print(ar[row][col] + " ");
            }
            else
            {
                while(col > 0)
                {
                    System.out.print(ar[row][col] + " ");
                    col--;
                }
                System.out.print(ar[row][col] + " ");
            }
            row++;
            flag = !flag;
        }
    }
}

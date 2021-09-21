package DSA.MultiDimensionalArrays;
import java.util.*;

/*
 *  TestCase :   i/p ---> 1  2  3  4
 *                        5  6  7  8
 *                        9 10 11 12
 *                       13 14 15 16
 *
 *              o/p ---> 1 2 5 9 6 3 4 7 10 13 14 11 8 12 15 16
 */

public class DiagonalZigZagPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");int r = sc.nextInt();
        System.out.print("Enter number of cols : ");int c = sc.nextInt();
        int [][] ar = new int[r][c];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
            {
                System.out.print("Enter " + i + "th row " + j + "th element : ");ar[i][j] = sc.nextInt();
            }
        System.out.print("Diagonal ZigZag of given matrix is : ");PrintDiagonalZigZag(ar, r, c);
    }

    private static void PrintDiagonalZigZag(int[][] ar, int r, int c) {
        boolean flag = true;
        int row = 0,col = 0;
        while(row < r && col < c)
        {
            if(flag)
            {
                while(row > 0 && col < c-1)
                {
                    System.out.print(ar[row][col] + " ");
                    row--;col++;
                }
                System.out.print(ar[row][col] + " ");
                if(col == c-1) row++;
                else col++;
            }
            else
            {
                while(col > 0 && row < r-1)
                {
                    System.out.print(ar[row][col] + " ");
                    row++;col--;
                }
                System.out.print(ar[row][col] + " ");
                if(row == r-1)col++;
                else row++;
            }
            flag = !flag;
        }
    }
}

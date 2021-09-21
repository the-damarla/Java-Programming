package DSA.MultiDimensionalArrays;
import java.util.*;

/*
 *  TestCase :   i/p ---> 1  2  3  4
 *                        5  6  7  8
 *                        9 10 11 12
 *                       13 14 15 16
 *
 *              o/p ---> 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
*/

public class SpiralPrintOfAMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");int r = sc.nextInt();
        System.out.print("Enter number of columns  : ");int c = sc.nextInt();
        int[][] ar = new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print("Enter " + i + "th row " + j + "th element : ");ar[i][j] = sc.nextInt();
            }
        }
        System.out.println("Spiral Traversal of the given matrix is : ");PrintSpiral(ar,r,c);
    }

    private static void PrintSpiral(int[][] ar, int r, int c) {
        int dir = 0;
        int left = 0,right = c-1,top = 0,bottom = r-1;
        while(left <= right && top <= bottom)
        {
            if(dir == 0)
            {
                for(int i=left;i<=right;i++)
                {
                    System.out.print(ar[top][i] + " ");
                }
                top++;
            }
            if(dir == 1)
            {
                for(int i=top;i<=bottom;i++)
                {
                    System.out.print(ar[i][right] + " ");
                }
                right--;
            }
            if(dir == 2)
            {
                for(int i=right;i>=left;i--)
                {
                    System.out.print(ar[bottom][i] + " ");
                }
                bottom--;
            }
            if(dir == 3)
            {
                for(int i=bottom;i>=top;i--)
                {
                    System.out.print(ar[i][left] + " ");
                }
                left++;
            }
            dir = (dir+1)%4;
        }
    }
}

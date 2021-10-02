package Patterns;
import java.util.*;

/*

        *      ---> getRightTriangle(n)
       **
      ***
     ****
    *****

 *****          ---> getRightInvertedTriangle(n)
  ****
   ***
    **
     *

         *          ---> getLeftMark(n)
       * *
     * * *
   * * * *
 * * * * *
   * * * *
     * * *
       * *
         *

 *                   ---> getRightMark(n)
 * *
 * * *
 * * * *
 * * * * *
 * * * *
 * * *
 * *
 *

 */

public class RightTriangle {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter number of lines : ");int n = sc.nextInt();
        getRightTriangle(n);System.out.println();
        getRightInvertedTriangle(n);System.out.println();
        getLeftMark(n);System.out.println();
        getRightMark(n);System.out.println();
    }

    private static void getRightMark(int n) {
        /*for(int i=1;i<=n;i++)
        {
            for (int j = 0; j < i; j++)
                System.out.print("*");
            System.out.print("\n");
        }
        for(int i=n;i>0;i--)
        {
            for(int j=i;j>0;j--)
                System.out.print("*");
            System.out.print("\n");
        }*/
        for(int row=0;row<2*n;row++)
        {
            int totColsInRow = row > n ? ((2*n)-row) : row;
            for(int col = 0;col<totColsInRow;col++)System.out.print("* ");
            System.out.println();
        }
    }

    private static void getLeftMark(int n) {
        /*for(int i=n;i>=0;i--)
        {
            for(int j=0;j<n;j++)
            {
                if(j>=i)System.out.print("*");
                else System.out.print(" ");
            }
            System.out.print("\n");
        }
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j>=i)System.out.print("*");
                else System.out.print(" ");
            }
            System.out.print("\n");
        }*/
        int spc = 0;
        for(int row=0;row<2*n;row++)
        {
            int totColsInRow = row > n ? ((2*n)-row) : row;
            int numOfSpaces = (n > row) ? n - row : spc++;
            for(int spaces=0;spaces<numOfSpaces;spaces++)System.out.print("  ");
            for(int col = 0;col<totColsInRow;col++)System.out.print("* ");
            System.out.println();
        }
    }

    private static void getRightInvertedTriangle(int n) {
        for(int rows=0;rows<=n;rows++)
        {
            for(int cols=0;cols<n;cols++)
            {
                if(cols>=rows)System.out.print("*");
                else System.out.print(" ");
            }
            System.out.print("\n");
        }
    }

    private static void getRightTriangle(int n) {
        for(int rows=n;rows>=0;rows--)
        {
            for(int cols=0;cols<n;cols++)
            {
                if(cols>=rows)System.out.print("*");
                else System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}

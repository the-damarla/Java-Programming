package Patterns;
import java.util.*;

/*

enter number of lines : 5
     *                      ---> getCommonChristmasTree(n)
    * *
   * * *
  * * * *
 * * * * *

* * * * *                   ---> getCommonInvertedChristmasTree(n)
 * * * *
  * * *
   * *
    *

        *                   ---> getNonSpacedChristmasTree(n)
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *

* * * * * * * * *           ---> getNonSpacedInvertedChristasTree(n)
  * * * * * * *
    * * * * *
      * * *
        *

     *                      ---> getOutlineOfChristmasTree(n)
    * *
   *   *
  *     *
 *       *
***********

***********                 ---> getInvertedOutlineOfChristmasTree(n)
 *       *
  *     *
   *   *
    * *
     *


*/

public class ChristmasTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of lines : ");int n = sc.nextInt();
        getCommonChristmasTree(n);System.out.println();
        getCommonInvertedChristmasTree(n);System.out.println();
        getNonSpacedChristmasTree(n);System.out.println();
        getNonSpacedInvertedChristasTree(n);System.out.println();
        getOutlineOfChristmasTree(n);System.out.println();
        getInvertedOutlineOfChristmasTree(n);System.out.println();
    }

    private static void getCommonInvertedChristmasTree(int n) {
        for(int rows=1;rows<=n;rows++)
        {
            for(int cols=1;cols<=n;cols++)
            {
                if(cols >= rows)System.out.print("* ");
                else System.out.print(" ");
            }
            System.out.print("\n");
        }
    }

    private static void getInvertedOutlineOfChristmasTree(int n) {
        for(int stars=0;stars<=2*n;stars++)System.out.print("*");System.out.print("\n");
        for(int rows=n;rows>=1;rows--)
        {
            int numOfSpaces = n - rows;
            for(int spaces=0;spaces<=numOfSpaces;spaces++)System.out.print(" ");
            System.out.print("*");
            for(int spaces=(rows-1)*2-1;spaces>0;spaces--)System.out.print(" ");
            if(rows != 1)System.out.print("*");
            System.out.print("\n");
        }
    }

    private static void getOutlineOfChristmasTree(int n) {
        /*int Odd = 1;
        for(int rows=0;rows<=n;rows++)
        {
            if(rows == n)
            {
                for(int stars=0;stars<=2*n;stars++)System.out.print("*");
                break;
            }
            int numOfSpaces = n - rows;
            int spaceAfterStar = (rows == 0) ? 0 : Odd;
            for(int spaces=0;spaces<numOfSpaces;spaces++)System.out.print(" ");
            System.out.print("*");
            for(int spaces=0;spaces<spaceAfterStar;spaces++)System.out.print(" ");
            if(spaceAfterStar == Odd)System.out.print("*");
            System.out.print("\n");
            Odd = (rows >= 1)? Odd+2 : Odd;
        }*/
        for(int rows=1;rows<=n;rows++)
        {
            int numOfSpaces = n - rows;
            for(int spaces=0;spaces<=numOfSpaces;spaces++)System.out.print(" ");
            System.out.print("*");
            for(int spaces=(rows-1)*2-1;spaces>0;spaces--)System.out.print(" ");
            if(rows != 1)System.out.print("*");
            System.out.print("\n");
        }
        for(int stars=0;stars<=2*n;stars++)System.out.print("*");
    }

    private static void getNonSpacedInvertedChristasTree(int n) {
        for(int row=n;row>=1;row--)
        {
            int NumOfSpaces = n-row;
            for(int spaces=0;spaces<NumOfSpaces;spaces++)System.out.print("  ");
            for(int cols=1;cols<=(row*2-1);cols++)System.out.print("* ");
            System.out.print("\n");
        }
    }

    private static void getNonSpacedChristmasTree(int n) {
        for(int row=1;row<=n;row++)
        {
            int NumOfSpaces = n-row;
            for(int spaces=0;spaces<NumOfSpaces;spaces++)System.out.print("  ");
            for(int cols=1;cols<=(row*2-1);cols++)System.out.print("* ");
            System.out.print("\n");
        }
    }

    private static void getCommonChristmasTree(int n) {
        for(int i=n;i>0;i--)
        {
            for(int j=0;j<=n;j++)
                if ((j < i)) System.out.print(" ");
                else System.out.print("* ");
            System.out.print("\n");
        }
    }
}

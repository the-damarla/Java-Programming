package Patterns;
import java.util.*;

/*

    *                       ---> getDiamondOfAsterisk(n)
   * *
  * * *
 * * * *
* * * * *
 * * * *
  * * *
   * *
    *

        1                   ---> getDiamondOfNumbers(n)
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5
  4 3 2 1 2 3 4
    3 2 1 2 3
      2 1 2
        1

* * * * * *  * * * * * *    ---> getDiamondOfSpaces(n)
* * * * *      * * * * *
* * * *          * * * *
* * *              * * *
* *                  * *
*                      *
* *                  * *
* * *              * * *
* * * *          * * * *
* * * * *      * * * * *
* * * * * *  * * * * * *

 * * * * * *                   ---> getDiamondWithCrunch(n)
  * * * * *
   * * * *
    * * *
     * *
      *
     * *
    * * *
   * * * *
  * * * * *
 * * * * * *

     *                          ---> getDiamondOfStars(n)
    * *
   *   *
  *     *
 *       *
*         *
 *       *
  *     *
   *   *
    * *
     *

*        *                      ---> getDiamondWithCut(n)
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *

*        *                      ---> getDiamondOfStarsWithCut(n)
**      **
* *    * *
*  *  *  *
*   **   *
*  *  *  *
* *    * *
**      **
*        *

*/

public class DiamondShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines : ");int n = sc.nextInt();
        getDiamondOfAsterisk(n);System.out.println();
        getDiamondOfNumbers(n);System.out.println();
        getDiamondOfSpaces(n);System.out.println();
        getDiamondWithCrunch(n);System.out.println();
        getDiamondOfStars(n);System.out.println();
        getDiamondWithCut(n);System.out.println();
        getDiamondOfStarsWithCut(n);System.out.println();
    }

    private static void getDiamondOfStarsWithCut(int n) {
        int originalN = n;
        for(int rows=1;rows<=n*2;rows++)
        {
            int starsToPrint = (rows < n) ? rows : originalN--;
            int numOfSpaces = (rows < n) ? n - rows : rows - n;
            for(int stars=0;stars<starsToPrint;stars++)
                if ((stars != 0 && stars != starsToPrint - 1)) System.out.print(" ");
                else System.out.print("*");
            for(int spaces=0;spaces<numOfSpaces;spaces++)System.out.print(" ");
            for(int spaces=0;spaces<numOfSpaces;spaces++)System.out.print(" ");
            for(int stars=0;stars<starsToPrint;stars++)
                if ((stars != 0 && stars != starsToPrint - 1)) System.out.print(" ");
                else System.out.print("*");
            System.out.print("\n");
        }
    }

    private static void getDiamondWithCut(int n) {
        int originalN = n;
        for(int rows=1;rows<=n*2;rows++)
        {
            int starsToPrint = (rows < n) ? rows : originalN--;
            int numOfSpaces = (rows < n) ? n - rows : rows - n;
            for(int stars=0;stars<starsToPrint;stars++)System.out.print("*");
            for(int spaces=0;spaces<numOfSpaces;spaces++)System.out.print(" ");
            for(int spaces=0;spaces<numOfSpaces;spaces++)System.out.print(" ");
            for(int stars=0;stars<starsToPrint;stars++)System.out.print("*");
            System.out.print("\n");
        }
    }

    private static void getDiamondOfStars(int n) {
        int originalN = n;
        for(int rows=0;rows<=2*n;rows++)
        {
            int numOfSpaces = (n > rows) ? n - rows : rows - n;
            int spacesAfterStar = (n > rows) ? (rows)*2-1 : (originalN--)*2-1;
            for(int spaces=0;spaces<numOfSpaces;spaces++)System.out.print(" ");
            System.out.print("*");
            for(int spaces=0;spaces<spacesAfterStar;spaces++)System.out.print(" ");
            if(rows !=0 && rows !=2*n)System.out.print("*");
            System.out.print("\n");
            //originalN = (rows > n)? originalN-- : originalN;
        }
    }

    private static void getDiamondWithCrunch(int n) {
        int originalN = n;
        for(int rows=0;rows<=2*n;rows++)
        {
            int numOfSpaces = (rows < n) ? rows : (originalN--);
            int numOfCols = (rows < n) ? n - rows : rows - n;
            for(int spaces=0;spaces<=numOfSpaces;spaces++)System.out.print(" ");
            for(int cols=0;cols<=numOfCols;cols++)System.out.print("* ");
            System.out.print("\n");
        }
    }

    private static void getDiamondOfSpaces(int n) {
        int originalN = n;
        for(int rows=0;rows<=2*n;rows++)
        {
            int numOfSpaces = (n > rows) ? rows : (originalN--);
            int numOfCols = (n > rows) ? n-rows : rows - n;
            for(int cols=0;cols<=numOfCols;cols++)System.out.print("* ");
            for(int spaces=0;spaces<numOfSpaces;spaces++)System.out.print("  ");
            for(int spaces=0;spaces<numOfSpaces;spaces++)System.out.print("  ");
            for(int cols=0;cols<=numOfCols;cols++)System.out.print(" *");
            System.out.print("\n");
        }
    }

    private static void getDiamondOfNumbers(int n) {
        for(int rows=1;rows<2*n;rows++)
        {
            int numOfSpaces = rows < n ? n-rows : rows - n;
            int numOfNumbers = n - numOfSpaces;
            for(int spaces=0;spaces<numOfSpaces;spaces++)System.out.print("  ");
            for(int cols=numOfNumbers;cols>=1;cols--)System.out.print(cols + " ");
            for(int cols=2;cols<=numOfNumbers;cols++)System.out.print(cols + " ");
            System.out.print("\n");
        }
    }

    private static void getDiamondOfAsterisk(int n) {
        for(int row=0;row<2*n;row++)
        {
            int totColsInRows = row > n ? ((2*n)-row) : row;
            int numOfSpaces = row < n ? n-row : row - n;
            for(int spaces=0;spaces<numOfSpaces;spaces++)System.out.print(" ");
            for(int cols=0;cols<totColsInRows;cols++)System.out.print("* ");
            System.out.print("\n");
        }
    }
}

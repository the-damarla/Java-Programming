package Patterns;
import java.util.*;

/*

1                     ---> getLeftContinuousNumberTriangle(n)
2 3
4 5 6
7 8 9 10
11 12 13 14 15

1                     ---> getLeftNumberTriangle(n)
1 2
1 2 3
1 2 3 4
1 2 3 4 5

1                  ---> getTriangleOfZeroAndOnes(n)
0 1
1 0 1
0 1 0 1
1 0 1 0 1

1 1 1 1 1          ---> getLeftInverted(n)
2 2 2 2
3 3 3
4 4
5

        1            --->getNumTriangle(n)
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5


1                  1    ---> getBiPartedNumberTriangle(n)
1 2              2 1
1 2 3          3 2 1
1 2 3 4      4 3 2 1
1 2 3 4 5  5 4 3 2 1


1 2 3 4 5     26 27 28 29 30  ---> getBiPartedContinuousTriangle(n) //(PS : Ignore the Spaces)
  6 7 8 9     22 23 24 25
  10 11 12    19 20 21
     13 14    17 18
        15    16



a                   ---> getLeftAplhaTriangle(n)
a b
a b c
a b c d
a b c d e

e                   ---> getLeftDecrementingAlphaTriangle(n)
d e
c d e
b c d e
a b c d e

e d c b a           ---> getLeftDecrementingAlphaTriangleInverted(n)
d c b a
c b a
b a
a

a                   ---> getLeftAlphaAlternateCapsTriangle(n)
B c
D e F
g H i J
k L m N o


*/

public class AlphabetAndNumberTriangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines : ");int n = sc.nextInt();
        getLeftNumberTriangle(n);System.out.println();
        getLeftContinuousNumberTriangle(n);System.out.println();
        getTriangleOfZeroAndOnes(n);System.out.println();
        getLeftInverted(n);System.out.println();
        getNumTriangle(n);System.out.println();
        getBiPartedNumberTriangle(n);System.out.println();
        getBiPartedContinuousTriangle(n);System.out.println();
        getLeftAplhaTriangle(n);System.out.println();
        getLeftDecrementingAlphaTriangle(n);System.out.println();
        getLeftDecrementingAlphaTriangleInverted(n);System.out.println();
        getLeftAlphaAlternateCapsTriangle(n);System.out.println();
    }

    private static void getBiPartedContinuousTriangle(int n) {
        int totCols = 2*n;
        int leftCol = 1;
        int rightCol = n*(n) + 1;
        for(int rows=0;rows<n;rows++)
        {
            int printRight = rightCol;
            for(int spaces=0;spaces<rows;spaces++)System.out.print("  ");
            for(int cols=0;cols<totCols;cols++)
                if(cols < (n - rows)) System.out.print(leftCol++ + " ");
                else System.out.print(printRight++ + " ");
            System.out.print("\n");
            totCols -= 2;
            rightCol -= (n-rows) - 1;
        }
    }

    private static void getBiPartedNumberTriangle(int n) {
        for(int rows=1;rows<=n;rows++)
        {
            int numOfSpaces = n - rows;
            for(int nums = 1; nums<= rows; nums++)System.out.print(nums + " ");
            for(int spaces=0;spaces<numOfSpaces*2;spaces++)System.out.print("  ");
            for(int nums = rows; nums>=1; nums--)System.out.print(" " + nums);
            System.out.print("\n");
        }
    }

    private static void getNumTriangle(int n) {
        for(int rows=1;rows<=n;rows++)
        {
            int totSpaces = n-rows;
            for(int spaces=0;spaces<totSpaces;spaces++)System.out.print("  ");
            for(int cols=rows;cols>=1;cols--)System.out.print(cols + " ");
            for(int cols=2;cols<=rows;cols++)System.out.print(cols + " ");
            System.out.print("\n");
        }
    }

    private static void getLeftAlphaAlternateCapsTriangle(int n) {
        int c = 0;
        boolean flag = true;
        for(int rows=0;rows<n;rows++)
        {
            for(int cols=0;cols<=rows;cols++)
            {
                if(!flag) System.out.print(Character.toUpperCase((char)(((int)'a') + c)) + " ");
                else System.out.print((char)(((int)'a') + c) + " ");
                c++;
                flag = !flag;
            }
            System.out.print("\n");
        }
    }

    private static void getLeftDecrementingAlphaTriangleInverted(int n) {
        for(int rows=('a'+n-1);rows>='a';rows--)
        {
            for(int cols=rows;cols>='a';cols--)
                System.out.print((char)cols + " ");
            System.out.print("\n");
        }
    }

    private static void getLeftDecrementingAlphaTriangle(int n) {
        for(int rows=('a'+n-1);rows>='a';rows--)
        {
            for(int cols=rows;cols<='a'+n-1;cols++)
                System.out.print((char)cols + " ");
            System.out.print("\n");
        }
    }

    private static void getLeftInverted(int n) {
        for(int rows=1;rows<=n;rows++)
        {
            for(int cols=n;cols>=rows;cols--) System.out.print(rows + " ");
            System.out.print("\n");
        }
    }

    private static void getTriangleOfZeroAndOnes(int n) {
        boolean flag = true;
        for(int rows=0;rows<n;rows++)
        {
            flag = (rows % 2 == 0);
            for(int cols=0;cols<=rows;cols++)
            {
                if(flag)System.out.print(1 + " ");
                else System.out.print(0 + " ");
                flag = !flag;
            }
            System.out.print("\n");
        }
    }

    private static void getLeftContinuousNumberTriangle(int n) {
        int c = 1;
        for(int rows=1;rows<=n;rows++)
        {
            for(int cols=1;cols<=rows;cols++)
            {
                System.out.print(c + " ");
                c++;
            }
            System.out.print("\n");
        }
    }

    private static void getLeftNumberTriangle(int n) {
        for(int rows=1;rows<=n;rows++)
        {
            for(int cols=1;cols<=rows;cols++)
                System.out.print(cols + " ");
            System.out.print("\n");
        }
    }

    private static void getLeftAplhaTriangle(int n) {
        for(char rows='a';rows<'a'+n;rows++)
        {
            for(char cols='a';cols<=rows;cols++)
                System.out.print(cols + " ");
            System.out.print("\n");
        }
    }
}

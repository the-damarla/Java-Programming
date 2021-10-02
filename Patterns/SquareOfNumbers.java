package Patterns;
import java.util.*;

/*

Enter number of lines : 5
5 5 5 5 5 5 5 5 5 5 5               ---> getSquareOfNumbersInDecreasingFashion(n)
5 4 4 4 4 4 4 4 4 4 5
5 4 3 3 3 3 3 3 3 4 5
5 4 3 2 2 2 2 2 3 4 5
5 4 3 2 1 1 1 2 3 4 5
5 4 3 2 1 0 1 2 3 4 5
5 4 3 2 1 1 1 2 3 4 5
5 4 3 2 2 2 2 2 3 4 5
5 4 3 3 3 3 3 3 3 4 5
5 4 4 4 4 4 4 4 4 4 5
5 5 5 5 5 5 5 5 5 5 5

0 0 0 0 0 0 0 0 0 0 0                ---> getSquareOfNumbersInIncreasingFashion(n)
0 1 1 1 1 1 1 1 1 1 0
0 1 2 2 2 2 2 2 2 1 0
0 1 2 3 3 3 3 3 2 1 0
0 1 2 3 4 4 4 3 2 1 0
0 1 2 3 4 5 4 3 2 1 0
0 1 2 3 4 4 4 3 2 1 0
0 1 2 3 3 3 3 3 2 1 0
0 1 2 2 2 2 2 2 2 1 0
0 1 1 1 1 1 1 1 1 1 0
0 0 0 0 0 0 0 0 0 0 0



*/

public class SquareOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines : ");int n = sc.nextInt();
        getSquareOfNumbersInDecreasingFashion(n);System.out.println();
        getSquareOfNumbersInIncreasingFashion(n);System.out.println();
    }

    private static void getSquareOfNumbersInIncreasingFashion(int n) {
        n *= 2;
        for(int rows=0;rows<=n;rows++)
        {
            for(int cols=0;cols<=n;cols++)
            {
                int atEveryIndex = Math.min(Math.min(rows,cols),Math.min(n-rows,n-cols));
                System.out.print(atEveryIndex + " ");
            }
            System.out.print("\n");
        }
    }

    private static void getSquareOfNumbersInDecreasingFashion(int n) {
        int OriginalN = n;
        n *= 2;
        for(int rows=0;rows<=n;rows++)
        {
            for(int cols=0;cols<=n;cols++)
            {
                int atEveryIndex = OriginalN - Math.min(Math.min(rows,cols),Math.min(n-rows,n-cols));
                System.out.print(atEveryIndex + " ");
            }
            System.out.print("\n");
        }
    }
}

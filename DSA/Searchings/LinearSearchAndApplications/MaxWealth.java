package DSA.Searchings.LinearSearchAndApplications;
import java.util.*;

/*
*  Test Cases : i/p ---> [[1 2 3],[4 1 2],[3 3 3]]
*               o/p ---> 9
*       Explanation ---> [1 + 2 + 3] --> 6
*                        [4 + 1 + 2] --> 7
*                        [3 + 3 + 3] --> 9
*                        max amongst these are 9, so answer is 9.
* */

public class MaxWealth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");int r = sc.nextInt();
        System.out.print("Enter number of cols : ");int c = sc.nextInt();
        int[][] ar = new int[r][c];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
            {
                System.out.print("Enter " + i + "row " + j + "th element : ");ar[i][j] = sc.nextInt();
            }
        System.out.print("MaxWealth is : " + getMaxWealth(ar, r, c));
    }

    private static int getMaxWealth(int[][] ar, int r, int c) {
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<r;i++)
        {
            int sum = 0;
            for(int j=0;j<c;j++)
            {
                sum += ar[i][j];
            }
            if(sum > maxi)maxi = sum;
        }
        return maxi;
    }
}

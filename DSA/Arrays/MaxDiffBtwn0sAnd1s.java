package DSA.Arrays;
import java.util.*;

/*
* TestCase : i/p ---> 1 1 0 0 0 0 1 0 0 0 1
*            o/p ---> 6
*    Explanation ---> From index 2 to index 9, there are 7 0s and 1 1s, so number of 0s - number of 1s is 6.
*/

public class MaxDiffBtwn0sAnd1s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<>();
        while(true)
        {
            System.out.print("Enter data : ");int x = sc.nextInt();
            if(x == -1)break;
            ar.add(x);
        }
        System.out.print("Max Difference between grp of 0's and 1's is : " + GetMaxDiff(ar, ar.size()));
    }

    private static int GetMaxDiff(ArrayList<Integer> ar, int n) {
        int res = 0,maxi = 0;
        for(int i=0;i<n;i++)
        {
            maxi += (ar.get(i) == 0) ? 1 : -1;
            maxi = (maxi < 0) ? 0 : maxi;
            res = Math.max(maxi,res);
        }
        return res;
    }
}

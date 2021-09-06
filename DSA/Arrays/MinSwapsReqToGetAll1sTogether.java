package DSA.Arrays;
import java.util.*;

/*
* TestCase : i/p ---> 1 0 0 1
*            o/p ---> 1
*    Explanation ---> as we only need to swap any 1 to get all 1's together
* */

public class MinSwapsReqToGetAll1sTogether {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<>();
        while(true)
        {
            System.out.print("Enter data : ");int x = sc.nextInt();
            if(x == -1)break;
            ar.add(x);
        }
        System.out.print("Minimum Swaps Required To get all 1's together are : " + GetMinSwaps(ar,ar.size()));
    }

    private static int GetMinSwaps(ArrayList<Integer> ar, int n) {
        int totCount = 0;
        for(int x:ar)totCount += x;
        int maxCount = 0,curCount = 0,i=0,j=0;
        while(j < n)
        {
            curCount += ar.get(j);
            if((j-i + 1) == totCount)
            {
                maxCount = Math.max(maxCount,curCount);
                if(ar.get(i) == 1)curCount--;
                i++;
            }
            j++;
        }
        return (totCount - maxCount);
    }
}

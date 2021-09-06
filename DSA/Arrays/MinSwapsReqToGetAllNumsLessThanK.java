package DSA.Arrays;
import java.util.*;

/*
* TestCase : i/p ---> 2, 7, 9, 5, 8, 7, 4
*            o/p ---> 2
*    explanation ---> here 2 & 4 are the elements that are  < 5 So they need to be swapped with 7&9 or 8&7
*                     So min swaps required are 2
*/

public class MinSwapsReqToGetAllNumsLessThanK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<>();
        while (true)
        {
            System.out.print("Enter data : ");int x = sc.nextInt();
            if(x == 0)break;
            ar.add(x);
        }
        System.out.print("Enter the number \'K\' : ");int K = sc.nextInt();
        System.out.print("Minimum swaps required to get all numbers less then " + K + " are : " + GetMinSwapsReq(ar, ar.size(), K));
    }

    private static int GetMinSwapsReq(ArrayList<Integer> ar, int n, int k) {
        int totCount = 0;
        for(int x : ar) totCount += (x <= k) ? 1 : 0;
        int maxCount = 0,curCount = 0;
        int j = 0,i = 0;
        while(j < n)
        {
            curCount += (ar.get(j) <= k) ? 1 : 0;
            if((j-i)+1 == totCount)
            {
                maxCount = Math.max(curCount,maxCount);
                if(ar.get(i) <= k)curCount--;
                i++;
            }
            j++;
        }
        return (totCount - maxCount);
    }
}

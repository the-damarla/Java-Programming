package DSA.Arrays;
import java.util.*;

/*
* Test Case : i/p ---> 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9
*             o/p ---> 3
*             Explanation ---> Jump from 1st element to 2nd element as there is only 1 step,
*                              now there are three options 5, 8 or 9. If 8 or 9 is chosen then the end node 9
*                              can be reached. So 3 jumps are made.
* */

public class MinJumpsReqToReachEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<>();
        while(true)
        {
            System.out.print("Enter data : ");int x = sc.nextInt();
            if(x == 0)break;
            ar.add(x);
        }
        System.out.print("Minimum number of jumps required are : " + CalMinJumps(ar,ar.size()));
    }

    private static int CalMinJumps(ArrayList<Integer> ar, int n) {
        int ladder = ar.get(0);
        if(ladder == 0)return -1;
        int steps = ar.get(0);
        int jumps = 1;
        for(int level=1;level<n;level++)
        {
            if((ar.get(level) + level) > ladder)ladder = (ar.get(level) + level);
            steps--;
            if(steps == 0)
            {
                jumps++;
                steps = (ladder - level);
            }
        }
        return jumps;
    }
}

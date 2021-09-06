package DSA.Arrays;
import java.util.*;

/*
* Test Case : i/p ---> 3, 0, 2, 0, 4
*             o/p ---> 7
*/

public class TrappingRainWaterProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<>();
        while (true)
        {
            System.out.print("Enter data : ");int x = sc.nextInt();
            if(x == -1)break;
            ar.add(x);
        }
        System.out.print("Maximum RainWater we can trap  is : " + GetMaxTrappedWater(ar, ar.size()));
    }

    private static int GetMaxTrappedWater(ArrayList<Integer> ar, int n) {
        ArrayList<Integer> left = new ArrayList<>(n);
        ArrayList<Integer> right = new ArrayList<>(n);
        for(int i=0;i<n;i++)right.add(i,0);
        left.add(0,ar.get(0));
        for(int i=1;i<n;i++)
        {
            left.add(i,Math.max(left.get((i-1)),ar.get(i)));
        }
        right.set(n-1,ar.get(n-1));
        for(int i=n-2;i>=0;i--)
        {
            right.set(i,Math.max(right.get(i+1),ar.get(i)));
        }
        int res = 0;
        for(int i=1;i<n-1;i++)
        {
            res += (Math.min(left.get(i),right.get(i)) - ar.get(i));
        }
        return res;
    }
}

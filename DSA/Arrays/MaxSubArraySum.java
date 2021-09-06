package DSA.Arrays;
import java.util.*;
/*
*  TestCase : i/p ---> -2, -3, 4, -1, -2, 1, 5, -3
*             o/p ---> 7
*/
public class MaxSubArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<>();
        while(true)
        {
            System.out.print("Enter data : ");int x = sc.nextInt();
            if(x == 0)break;
            ar.add(x);
        }
        System.out.print("Maximum SubArray aum is : " + GetMaxSubArraySum(ar, ar.size()));
    }

    private static int GetMaxSubArraySum(ArrayList<Integer> ar, int n) {
        int maxi = 0,res = 0;
        for(int i=0;i<n;i++)
        {
            maxi = Math.max(ar.get(i), maxi+ar.get(i));
            res = Math.max(res,maxi);
        }
        return res;
    }
}

package DSA.Arrays;
import java.util.*;

/*
 *  TestCase : i/p --->  12, 9, 10, 6, 18, 14, 20
 *             o/p ---> [7, 8, 11, 13, 15, 16, 17, 19]
*/

public class MissingElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<>();
        while (true)
        {
            System.out.print("Enter data : ");int x = sc.nextInt();
            if(x == 0)break;
            ar.add(x);
        }
        System.out.print("The missing element(s) is/are : " + GetMissingElements(ar, ar.size()));
    }

    private static ArrayList<Integer> GetMissingElements(ArrayList<Integer> ar, int n) {
        int mini = Collections.min(ar);
        int maxi = Collections.max(ar);
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=mini;i<=maxi;i++)
        {
            if(ar.contains(i))continue;
            else ans.add(i);
        }
        return ans;
    }
}

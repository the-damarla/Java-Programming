package DSA.Searchings.BinarySearchAndApplications;
import java.util.*;

/*
* Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.
* If target is not found in the array, return [-1, -1].
*
*   TestCases : Input: nums = [5,7,7,8,8,10], target = 8
                Output: [3,4]
              * Input: nums = [5,7,7,8,8,10], target = 6
                Output: [-1,-1]
              * Input: nums = [], target = 0
                Output: [-1,-1]
* */

public class FirstAndLastPositionsOfAnElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<>();
        while (true)
        {
            System.out.print("Enter data : ");int x = sc.nextInt();
            if(x == 0)break;
            ar.add(x);
        }
        System.out.print("Enter number to find its first and last positions : ");int s = sc.nextInt();
        System.out.print("Positions of first and last are : " + getFirstAndLast(ar, 0, ar.size() - 1, s));
    }

    private static ArrayList<Integer> getFirstAndLast(ArrayList<Integer> ar, int start, int end, int s) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(-1);ans.add(-1);
        ans.set(0,Search(ar,start,end,s,true));
        ans.set(1,Search(ar,start,end,s,false));
        return ans;
    }

    private static int Search(ArrayList<Integer> ar, int start, int end, int s, boolean find) {
        int ans = -1;
        while (start <= end)
        {
            int mid = (start + (end - start)/ 2);
            if(s > ar.get(mid))start = mid+1;
            else if(s < ar.get(mid))end = mid-1;
            else
            {
                ans = mid;
                if(find) end = mid-1;
                else start = mid+1;
            }
        }
        return ans;
    }
}

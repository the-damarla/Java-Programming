package DSA.Searchings.BinarySearchAndApplications;
import java.util.*;

/*
*  Test Case : Input ---> array = [1,2,3,4,5,3,1], target = 3
               Output ---> 2
          Explanation ---> 3 exists in the array, at index=2 and index=5. Return the minimum index, which is 2.
* */

public class FindElementInMountainArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<>();
        while (true)
        {
            System.out.print("Enter data : ");int x = sc.nextInt();
            if(x == 0)break;
            ar.add(x);
        }
        System.out.print("Enter element to Search : ");int s = sc.nextInt();
        System.out.print("Element found at : " + getIndexOfElement(ar, s, ar.size() - 1));
    }

    private static int getIndexOfElement(ArrayList<Integer> ar, int s, int n) {
        int peak = getPeakElement(ar,0,n);
        int firstTry = getIndex(ar,0,peak,s);
        if(firstTry != -1)return firstTry;
        return getIndex(ar,peak+1,n,s);

    }

    private static int getPeakElement(ArrayList<Integer> ar, int start, int end) {
        while(start < end)
        {
            int mid = ((start + end) / 2);
            if(ar.get(mid) > ar.get(mid+1)) end = mid;
            else start = mid+1;
        }
        return ar.get(start);
    }

    private static int getIndex(ArrayList<Integer> ar, int start, int end, int s) {
        while (start <= end)
        {
            int mid = (start + end) / 2;
            if(ar.get(mid) < s)start = mid + 1;
            else if(ar.get(mid) > s)end = mid-1;
            else return mid;
        }
        return -1;
    }
}

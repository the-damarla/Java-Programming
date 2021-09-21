package DSA.Searchings.BinarySearchAndApplications;
import java.util.*;

/*
*  Test Cases : i/p ---> [-1 1 -1]      i/p ---> [1 4 5 6 2 1]
*               o/p ---> 1              o/p ---> 6
* */

public class FindingPeakElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<>();
        while (true)
        {
            System.out.print("Enter data : ");int x = sc.nextInt();
            if(x == 0)break;
            ar.add(x);
        }
        System.out.print("Peak Element in the given Array is : " + getPeakElement(ar, 0, ar.size() - 1));
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
}

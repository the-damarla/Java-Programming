package DSA.Searchings.BinarySearchAndApplications;
import java.util.*;

/*
*  Test Cases : i/p ---> [3 4 5 6 7 1 2 3]   s ---> 5          i/p ---> [4 5 6 7 -1 1 2]   s ---> -1
*               o/p ---> 2   (5 is at index 2)                 o/p ---> 4
* */

public class SearchAnElementInRotatedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<>();
        while (true)
        {
            System.out.print("Enter data : ");int x = sc.nextInt();
            if(x == 0)break;
            ar.add(x);
        }
        System.out.print("Enter Searching number : ");int s = sc.nextInt();
        System.out.print("Given element is present at : " + getIndex(ar, 0, ar.size() - 1, s));
    }

    private static int getIndex(ArrayList<Integer> ar, int start, int end, int s) {
        int pInd = -1;
        for(int i=start;i<end;i++)if(ar.get(i) > ar.get(i+1))
        {
            pInd = i;
            break;
        }
        if(pInd == -1) return binarySearch(ar, start, end, s);
        if(ar.get(pInd) == s)return pInd;
        if(s < ar.get(0))return binarySearch(ar,pInd+1,end,s);
        return binarySearch(ar,start,pInd,s);
    }

    private static int binarySearch(ArrayList<Integer> ar, int start, int end, int s) {
        while(start < end)
        {
            int mid = ((start + end) / 2);
            if(ar.get(mid) == s)return mid;
            else if(s < ar.get(mid))end = mid;
            else start = mid+1;
        }
        return -1;
    }

}

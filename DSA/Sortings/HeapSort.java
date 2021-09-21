package DSA.Sortings;
import java.util.*;

/*
 * Time Complexity : O(nLogn), SpaceComplexity : O(1), Stability : NO, in-place Sorting Algorithm and Recursive in nature
*/

public class HeapSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<>();
        while (true)
        {
            System.out.print("Enter data : ");int x = sc.nextInt();
            if(x == 0)break;
            ar.add(x);
        }
        System.out.print("Array after HeapSorting is : " + getHeapSort(ar,ar.size()));
    }

    private static ArrayList<Integer> getHeapSort(ArrayList<Integer> ar, int n) {
        for(int i=((n/2)-1);i>=0;i--)
        {
            Heapify(ar,n,i);
        }
        for(int i=n-1;i>0;i--)
        {
            SwapThePos(ar,0,i);
            Heapify(ar,i,0);
        }
        return ar;
    }

    private static void Heapify(ArrayList<Integer> ar, int n, int i) {
        int large = i;
        int l = ((2*i) + 1);
        int r = ((2*i) + 2);
        if(l < n && ar.get(l) > ar.get(large)) large = l;
        if(r < n && ar.get(r) > ar.get(large)) large = r;
        if(large != i)
        {
            SwapThePos(ar,i,large);
            Heapify(ar,n,large);
        }
    }

    private static void SwapThePos(ArrayList<Integer> ar, int i, int j) {
        int temp = ar.get(i);
        ar.set(i,ar.get(j));
        ar.set(j,temp);
    }
}

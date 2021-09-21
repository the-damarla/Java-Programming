package DSA.Sortings;
import java.util.*;

/*
 *  Time Complexity : O(n^2), Space Complexity : O(1) Stable Sorting, In-place Sorting and non-recursive in nature
*/

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<>();
        while (true)
        {
            System.out.print("Enter data : ");int x = sc.nextInt();
            if(x == 0)break;
            ar.add(x);
        }
        System.out.print("Array after Insertion Sort is : " + getInsertionSort(ar,ar.size()));
    }

    private static ArrayList<Integer> getInsertionSort(ArrayList<Integer> ar, int n) {
        for(int i=0;i<n-1;i++)
            for(int j=i+1;j>0;j--)
                if(ar.get(j) < ar.get(j-1)) SwapPos(ar,j,j-1);
                else break;
        return ar;
    }

    private static void SwapPos(ArrayList<Integer> ar, int i, int j) {
        int temp = ar.get(i);
        ar.set(i,ar.get(j));
        ar.set(j,temp);
    }

    /*private static ArrayList<Integer> getInsertionSort(ArrayList<Integer> ar, int n) {
        int hole,value;
        for(int i=1;i<n;i++)
        {
            value = ar.get(i);
            hole = i;
            while (hole > 0 && ar.get(hole-1) > value)
            {
                ar.set(hole,ar.get(hole-1));
                hole--;
            }
            ar.set(hole,value);
        }
        return ar;
    }*/
}

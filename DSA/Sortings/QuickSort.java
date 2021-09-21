package DSA.Sortings;
import java.util.*;

/*
 * Time Complexity : O(nlogn), Space Complexity : O(1), Stability : No, In-Place Sorting & Recursive in nature
*/

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<>();
        while(true)
        {
            System.out.print("Enter data : ");int x = sc.nextInt();
            if(x == 0)break;
            ar.add(x);
        }
        System.out.print("Array after QuickSort : " );
        getQuickSort(ar,0,ar.size()-1);
        for(int num:ar)System.out.print(num + " ");
    }

    private static void getQuickSort(ArrayList<Integer> ar, int low, int high) {
        if(low < high)
        {
            int pi = Partition(ar,low,high);

            getQuickSort(ar,low,pi-1);
            getQuickSort(ar,pi+1,high);
        }
    }

    private static int Partition(ArrayList<Integer> ar, int low, int high) {
        int pivot = ar.get(high);
        int pInd = low-1;
        for(int i = low;i <= high-1;i++)
        {
            if(ar.get(i) < pivot)
            {
                pInd++;
                SwapPos(ar,pInd,i);
            }
        }
        SwapPos(ar,pInd+1,high);
        return (pInd+1);
    }

    private static void SwapPos(ArrayList<Integer> ar, int i, int j) {
        int temp = ar.get(i);
        ar.set(i,ar.get(j));
        ar.set(j,temp);
    }
}

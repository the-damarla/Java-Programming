package DSA.Sortings;
import java.util.*;

/*
*  Time Complexity : O(n^2),  Space Complexity : O(1),  Stability : No, Internal Sorting Algorithm and Non-recursive
 */

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<>();
        while(true)
        {
            System.out.print("Enter data : ");int x = sc.nextInt();
            if(x == 0)break;
            ar.add(x);
        }
        SelectAndSort(ar,ar.size());
        /*
        System.out.print("Array after sorting is : " + SelectAndSort(ar,ar.size()));

        if we use the above print statement, we can just make the "SelectAndSort" Function return type to ArrayList
        As ArrayList is a Non-primitive or reference DataType its reference is passed So changes made at function
        are permanently made.
         */
        //System.out.print("Array after sorted is : " + ar);
        System.out.print("Array after Sorted  : ");
        for(int num:ar)System.out.print(num + " ");
    }

    private static void SelectAndSort(ArrayList<Integer> ar, int n) {
        for(int i=0;i<n;i++)
        {
            int minInd = i;
            for(int j=i+1;j<n;j++)
                if(ar.get(j) < ar.get(minInd))minInd = j;
            int temp = ar.get(i);
            ar.set(i,ar.get(minInd));
            ar.set(minInd,temp);
        }
    }
}

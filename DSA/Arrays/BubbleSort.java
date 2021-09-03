package DSA.Arrays;
import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<>();
        while(true)
        {
            System.out.print("enter data : ");int x = sc.nextInt();
            if(x == 0)break;
            ar.add(x);
        }
        System.out.print("Array after Sorting is : " + bubbles(ar,ar.size()));
    }

    private static ArrayList bubbles(ArrayList<Integer> ar, int n) {
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(ar.get(i) > ar.get(j))
                {
                    int temp = ar.get(i);
                    ar.set(i,ar.get(j));
                    ar.set(j,temp);
                }
            }
        }
        return ar;
    }
}

package DSA.Arrays;
import java.util.*;
/*
* Test Case : i/p  ---->   1, 0, -2, -3, 1, 0, 0, 4, 5
*             o/p  ---->  [-2, -3, 0, 0, 0, 1, 4, 5, 1]
*/
public class SegNegPosZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<>();
        while(true)
        {
            System.out.print("enter data : ");int x = sc.nextInt();
            if(x == -1)break;
            ar.add(x);
        }
        System.out.print("Segregated array is : " + GetSegAr(ar, ar.size()));
    }

    private static ArrayList<Integer> GetSegAr(ArrayList<Integer> ar, int n) {
        int high = n-1,low = 0,mid = 0;
        while(mid < high)
        {
            if(ar.get(mid) < 0)
            {
                swap(ar,low,mid);
                low++;mid++;
            }
            if(ar.get(mid) == 0)mid++;
            if(ar.get(mid) > 0)
            {
                swap(ar,mid,high);
                high--;
            }
        }
        return ar;
    }

    private static void swap(ArrayList<Integer> ar, int low, int mid) {
        int temp = ar.get(low);
        ar.set(low,ar.get(mid));
        ar.set(mid,temp);
    }
}

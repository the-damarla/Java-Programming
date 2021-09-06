package DSA.Arrays;
import java.util.*;

/*
* Test Case : i/p --->  1, 2, 3, 4, 5, 6, 7, 8, 9, 10
*             o/p ---> [2, 1, 4, 3, 6, 5, 8, 7, 10, 9]
*/

public class ZigZagFormOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<>();
        while (true)
        {
            System.out.print("Enter data : ");int x = sc.nextInt();
            if(x == 0)break;
            ar.add(x);
        }
        System.out.print("Zig Zag Form of given array is : " + GetZigZag(ar, ar.size()));
    }

    private static ArrayList<Integer> GetZigZag(ArrayList<Integer> ar, int n) {
        for(int i=0;i<n-1;i+=2)
        {
            Swap(ar,i,i+1);
        }
        return ar;
    }

    private static void Swap(ArrayList<Integer> ar, int i, int j) {
        int temp = ar.get(i);
        ar.set(i,ar.get(j));
        ar.set(j,temp);
    }
}

package Recursions;
import java.util.*;

/*
Input: arr = {1, 4, 3, -5, -4, 8, 6};
Output: min = -5, max = 8
*/

public class maxAndMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<>();
        while (true)
        {
            System.out.print("Enter data : ");int x = sc.nextInt();
            if(x == 0)break;
            ar.add(x);
        }
        getMinAndMax(ar, ar.size(), 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static void getMinAndMax(ArrayList<Integer> ar, int n, int s, int maxi, int mini) {
        if(s >= n)
        {
            System.out.print("Min of the given array is : " + mini + "\nMax Of the Array is : " + maxi);
            return;
        }
        if(ar.get(s) > maxi)maxi = ar.get(s);
        if(ar.get(s) < mini)mini = ar.get(s);
        getMinAndMax(ar, n, ++s , maxi, mini);
    }
}

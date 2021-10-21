package DSA.Arrays;
import java.util.*;

/*
* Test Cases : i/p --->  [4 2 5 0 1 8]
*              o/p ---> 3
*      Explanation ---> actual array is [0 1 2 '3' 4 5 '6' '7' 8]
*                       missing elements are 3 6 7, smallest among them is 3, So answer is 3.
* */

public class SmallestNumberMissingInAnUnsortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<>();
        while (true)
        {
            System.out.print("Enter data : ");int x = sc.nextInt();
            if(x == -1)break;
            ar.add(x);
        }
        System.out.print("Smallest Missing number is : " + getMissing(ar, ar.size()));
    }

    private static int getMissing(ArrayList<Integer> ar, int n) {
        int mini = Collections.min(ar);
        int maxi = Collections.max(ar);
        for(int i=mini;i<=maxi;i++)
        {
            if(!ar.contains(i))return i;
        }
        return -1;
    }
}

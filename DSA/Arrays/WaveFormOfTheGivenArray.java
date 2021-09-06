package DSA.Arrays;
import java.util.*;

/*
* Test Case : i/p --->   1, 2, 3, 4, 5, 6, 7, 8, 9, 10
*             o/p --->  [1, 3, 2, 5, 4, 7, 6, 9, 8, 10]
*     Explanation --->  Simply the middle element will be greater than its left and right elements
*/

public class WaveFormOfTheGivenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<>();
        while(true)
        {
            System.out.print("Enter Data : ");int x = sc.nextInt();
            if(x == 0)break;
            ar.add(x);
        }
        System.out.print("Wave form of the Given Array is : " + GetWave(ar, ar.size()));
    }

    private static ArrayList<Integer> GetWave(ArrayList<Integer> ar, int n) {
        boolean flag = true;
        for(int i=0;i<n-1;i++)
        {
            if(flag)
            {
                if(ar.get(i) > ar.get(i+1))Swap(ar,i,i+1);
            }
            else
            {
                if(ar.get(i) < ar.get(i+1))Swap(ar,i,i+1);
            }
            flag = !flag;
        }
        return ar;
    }

    private static void Swap(ArrayList<Integer> ar, int i, int j) {
        int temp = ar.get(i);
        ar.set(i,ar.get(j));
        ar.set(j,temp);
    }
}

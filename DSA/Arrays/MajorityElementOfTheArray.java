package DSA.Arrays;
import java.util.*;

/*
*   Test Case : i/p ---> 3, 3, 4, 2, 4, 4, 2, 4, 4
*               o/p ---> 4
*       Explanation ---> Frequency of 4 is  > (ar.size()/2)
*/

public class MajorityElementOfTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<>();
        while(true)
        {
            System.out.print("Enter data : ");int x = sc.nextInt();
            if(x == 0)break;
            ar.add(x);
        }
        System.out.print("Majority Element of the Array is : " + FindMajor(ar,ar.size()));
    }

    private static int FindMajor(ArrayList<Integer> ar, int n) {
        int comp = ar.get(0);
        int c = 1;
        for(int i=1;i<n;i++)
        {
            if(comp == ar.get(i))c++;
            else
            {
                c--;
                if(c == 0)
                {
                    comp = ar.get(i);
                    c = 1;
                }
            }
        }
        return Verify(ar,n,comp) ? comp : -1;
    }

    private static boolean Verify(ArrayList<Integer> ar, int n, int comp) {
        int c = 0;
        for(int x : ar)if(x == comp)c++;
        return (c > (n/2));
    }
}

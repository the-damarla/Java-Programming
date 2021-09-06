package DSA.Arrays;
import java.util.*;

/*
 * TestCase : i/p --->  1, 2, 4   i/p --->  9, 9, 9
 *            o/p ---> [1, 2, 5]  o/p ---> [1, 0, 0, 0]
*/

public class PlusOneToTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<>();
        while (true)
        {
            System.out.print("Enter data : ");int x = sc.nextInt();
            if(x == -1)break;
            ar.add(x);
        }
        System.out.print("After Adding +1 to the given array : " + GetAfterPlusOne(ar, ar.size()));
    }

    private static ArrayList<Integer> GetAfterPlusOne(ArrayList<Integer> ar, int n) {
        for(int i=n-1;i>=0;i--)
        {
            if(ar.get(i) < 9)
            {
                ar.set(i,(ar.get(i)+1));
                return ar;
            }
            ar.set(i,0);
            if(i == 0)
            {
                GetReverse(ar, ar.size());
                ar.add(1);
                GetReverse(ar, ar.size());
            }
        }
        return ar;
    }

    private static void GetReverse(ArrayList<Integer> ar, int n) {
        int i = 0,j=n-1;
        while(i < j)
        {
            int temp = ar.get(i);
            ar.set(i, ar.get(j));
            ar.set(j, temp);
            i++;j--;
        }
    }
}

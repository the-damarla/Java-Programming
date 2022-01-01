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
        System.out.print("After Adding +1 to the given array : " + getAfterPlusOne(ar, ar.size()));
    }

    private static ArrayList<Integer> getAfterPlusOne(ArrayList<Integer> ar, int n) {
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
                Collections.reverse(ar);
                ar.add(1);
                Collections.reverse(ar);
            }
        }
        return ar;
    }
}

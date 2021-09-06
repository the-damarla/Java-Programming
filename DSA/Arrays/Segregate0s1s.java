package DSA.Arrays;
import java.util.*;

/*
* TestCase :  i/p ---> 1 0 0 1 1 1 0 0
*             o/p ---> 0 0 0 0 1 1 1 1
*/

public class Segregate0s1s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<>();
        while(true)
        {
            System.out.print("enter data : ");int x = sc.nextInt();
            if(x == -1)break;
            ar.add(x);
        }
        System.out.print("Array after Segregation : " + GetSegArray(ar, ar.size()));
    }

    private static ArrayList<Integer> GetSegArray(ArrayList<Integer> ar, int n) {
        int c = 0;
        for(int i=0;i<n;i++)
        {
            if(ar.get(i) != 0)       //if 0's has to come right side just keep (ar.get(i) != 0) as if condition
            {
                Swap(ar,i,c);
                c++;
            }
        }
        return ar;
    }

    private static void Swap(ArrayList<Integer> ar, int i, int c) {
        int temp = ar.get(i);
        ar.set(i,ar.get(c));
        ar.set(c,temp);
    }
}

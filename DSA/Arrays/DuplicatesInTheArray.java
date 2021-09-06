package DSA.Arrays;
import java.util.*;

/*
 * TestCase :  i/p ---> 1, 2, 3, 2, 4, 1, 5, 6, 4
 *             o/p ---> [1, 2, 4]
*/

public class DuplicatesInTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<>();
        while (true)
        {
            System.out.print("Enter data : ");int x = sc.nextInt();
            if(x == 0)break;
            ar.add(x);
        }
        System.out.print("Duplicates in the Given Array are : " + GetDuplicates(ar, ar.size()));
    }

    private static HashSet<Integer> GetDuplicates(ArrayList<Integer> ar, int n) {
        HashSet<Integer> dup1 = new HashSet<>();
        HashSet<Integer> dup2 = new HashSet<>();
        for(int i=0;i<n;i++)
        {
            if(dup1.contains(ar.get(i))) dup2.add(ar.get(i));
            else dup1.add(ar.get(i));
        }
        return dup2;
    }
}

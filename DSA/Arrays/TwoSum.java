package DSA.Arrays;
import java.util.*;

/*
 * TestCase : i/p ---> 1, 4, 45, 6, 10, 8  sum = 16
 *            o/p ---> (6, 10)
*/

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<>();
        while (true)
        {
            System.out.print("Enter data : ");int x = sc.nextInt();
            if(x == 0)break;
            ar.add(x);
        }
        System.out.print("Enter sum that has to be found in given array : ");int sum = sc.nextInt();
        System.out.print("The pairs that have " + sum + " as their sum are : ");
        GetPairsWithSum(ar, ar.size(), sum);
    }

    private static void GetPairsWithSum(ArrayList<Integer> ar, int n, int sum) {
        HashSet<Integer> s = new HashSet<>();
        for(int i=0;i<n;i++)
        {
            int temp = (sum - ar.get(i));
            if(s.contains(temp))System.out.print(temp + " " + ar.get(i) + "\n");
            s.add(ar.get(i));
        }
    }
}

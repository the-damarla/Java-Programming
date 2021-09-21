package DSA.Searchings.LinearSearchAndApplications;
import java.util.*;

public class FindMinMaxInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<>();
        while (true)
        {
            System.out.print("enter data : ");int x = sc.nextInt();
            if(x == 0)break;
            ar.add(x);
        }
        System.out.println("Minimum element in the given array is : " + getMin(ar, ar.size()));
        System.out.print("Maximum element in the given array is : " + getMax(ar, ar.size()));
    }

    private static int getMax(ArrayList<Integer> ar, int n) {
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)if(ar.get(i) > maxi)maxi = ar.get(i);
        return maxi;
    }

    private static int getMin(ArrayList<Integer> ar, int n) {
        int mini = Integer.MAX_VALUE;
        for(int i=0;i<n;i++)if(ar.get(i) < mini)mini = ar.get(i);
        return mini;
    }
}

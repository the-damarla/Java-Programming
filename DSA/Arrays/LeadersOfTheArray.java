package DSA.Arrays;
import java.util.*;

/*
* test case : i/p ---> 16, 17, 4, 3, 5, 2
*             o/p ---> 17 5 2
*             explanation ---> because these elements are greater by their value to the
*                              elements present to their right of the given i/p.
* */

public class LeadersOfTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<>();
        while(true)
        {
            System.out.print("Enter data : ");int x = sc.nextInt();
            if(x == 0)break;
            ar.add(x);
        }
        System.out.print("Leader so the Given Array are : " + Rev(FindLeaders(ar,ar.size())));
    }

    static ArrayList<Integer> Rev(ArrayList<Integer> ar) {
        int n = ar.size();
        int i = 0,j=n-1;
        while(i < j)
        {
            int temp = ar.get(i);
            ar.set(i,ar.get(j));
            ar.set(j,temp);
            i++;j--;
        }
        return ar;
    }

    static ArrayList<Integer> FindLeaders(ArrayList<Integer> ar, int n) {
        ArrayList<Integer> lead = new ArrayList<>();
        lead.add(ar.get(n-1));
        int c = ar.get(n-1);
        for(int i=n-2;i>=0;i--)
        {
            if(c < ar.get(i))
            {
                c = ar.get(i);
                lead.add(c);
            }
        }
        return lead;
    }
}

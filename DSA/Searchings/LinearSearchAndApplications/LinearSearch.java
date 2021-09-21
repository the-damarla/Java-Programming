package DSA.Searchings.LinearSearchAndApplications;
import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar =  new ArrayList<>();
        while (true)
        {
            System.out.print("Enter data : ");int x = sc.nextInt();
            if(x == 0)break;
            ar.add(x);
        }
        System.out.print("Enter a number to search : ");int s = sc.nextInt();
        System.out.print("Given number is found at : " + getIndex(ar, ar.size(), s));
    }

    private static int getIndex(ArrayList<Integer> ar, int n, int s) {
        for(int i=0;i<n;i++)
        {
            if(ar.get(i) == s)return i;
        }
        return -1;
    }
}

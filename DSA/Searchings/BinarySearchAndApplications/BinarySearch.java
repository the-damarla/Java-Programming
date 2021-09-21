package DSA.Searchings.BinarySearchAndApplications;
import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<>();
        while (true)
        {
            System.out.print("Enter data : ");int x = sc.nextInt();
            if(x == 0)break;
            ar.add(x);
        }
        System.out.print("Enter a number to search : ");int s = sc.nextInt();
        if ((BinSearch(ar,0 ,ar.size()-1, s))) {
            System.out.print("Given element is there");
        } else {
            System.out.print("Given element is not there");
        }
    }

    private static boolean BinSearch(ArrayList<Integer> ar, int start,int end ,int s) {
        while(start <= end)
        {
            int mid = ((start+end)/2);
            if(ar.get(mid) == s)return true;
            if(ar.get(mid) < s)start = mid+1;
            if(ar.get(mid) > s)end = mid-1;
        }
        return false;
    }
}

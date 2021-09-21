package DSA.Searchings.BinarySearchAndApplications;
import java.util.*;

/*
* Test Cases : Input : arr[] = {1, 2, 8, 10, 10, 12, 19}, s = 5       Input : arr[] = {1, 2, 8, 10, 10, 12, 19}, x = 0
*              Output : 2                                             Output : -1
*
*              Input : arr[] = {1, 2, 8, 10, 10, 12, 19}, s = 20
*              Output : 19
* */

public class FloorOfANumberInGivenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<>();
        while(true)
        {
            System.out.print("Enter data : ");int x = sc.nextInt();
            if(x == 0)break;
            ar.add(x);
        }
        System.out.print("Enter a number : ");int s = sc.nextInt();
        System.out.print("Floor of the given number is : " + getFloor(ar, 0, ar.size() - 1, s));
    }

    private static int getFloor(ArrayList<Integer> ar, int start, int end, int s) {
        if(s < ar.get(0))return -1;
        while (start <= end)
        {
            int mid = ((start+end)/2);
            if(ar.get(mid) < s)start = mid+1;
            else if(ar.get(mid) > s)end = mid-1;
            else return ar.get(mid);
        }
        return ar.get(end);
    }
}

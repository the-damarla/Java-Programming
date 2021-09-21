package DSA.Searchings.BinarySearchAndApplications;
import java.util.*;

/*
* Test Cases : Input : arr[] = {1, 2, 8, 10, 10, 12, 19}, s = 3
*              Output : 8
 * */

public class CeilOfANumberInTheGivenArray {
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
        System.out.print("Ceil of the given number in the array is : " + getCeil(ar, 0, ar.size() - 1, s));
    }

    private static int getCeil(ArrayList<Integer> ar, int start, int end, int s) {
        if(s > ar.get(end))return -1;
        while (start <= end)
        {
            int mid = ((start + end) / 2);
            if(ar.get(mid) < s)start = mid+1;
            else if(ar.get(mid) > s)end = mid-1;
            else return ar.get(mid);
        }
        return ar.get(start);
    }
}

package DSA.Searchings.BinarySearchAndApplications;
import java.util.*;

/*
* Infinite Array in the sense, in this program we never try to determine the size of the array in any way i.e,
* we won't be using ar.size() or ar.length() to find the size of the array, So basically it becomes an infinite array.
*       Intuition : Here we are considering a window of size 2 initially and we will be keep on doubling the window size
*                   till we find Search Element lesser than End element of the window. Here the element that we are
*                   Searching for will be definitely present.
*                   --> Here we won't be moving the window, we will be changing the indices of the window directly
*                       i.e, 1st element after end of 1st window becomes start of next window.
* */

public class FindingPositionOfAnElementInInfiniteArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<>();
        while (true)
        {
            System.out.print("Enter data : ");int x = sc.nextInt();
            if(x == 0)break;
            ar.add(x);
        }
        System.out.print("Enter an element to search : ");int s = sc.nextInt();
        System.out.print("Element found at : " + getElementIndex(ar, s));
    }

    private static int getElementIndex(ArrayList<Integer> ar, int s) {
        int start = 0;
        int end = 1;
        while (s > ar.get(end))
        {
            int temp = end + 1;
            end += (end - start + 1) * 2;
            start = temp;
        }
        return getIndex(ar, start, end, s);
    }

    private static int getIndex(ArrayList<Integer> ar, int start, int end, int s) {
        while (start <= end)
        {
            int mid = (start + end) / 2;
            if(ar.get(mid) < s)start = mid + 1;
            else if(ar.get(mid) > s)end = mid-1;
            else return mid;
        }
        return -1;
    }
}

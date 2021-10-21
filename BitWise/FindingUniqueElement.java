package BitWise;
import java.util.*;

/*
*   Test Cases : i/p ---> [2, 3, 4, 1, 2, 1, 3, 6, 4]
*                o/p ---> Unique Element in the given array is : 6

                * Here intuition is, when we exOr a number with 0 it becomes 1 and if we exOr this 1 with given number it becomes Zero.
                * So repeating elements in the given array will cancel out and unique element will be remained.
                * 2 --> 1 0   exOr --> 0 1
                * 0 --> 0 0      2 --> 1 0
                * Xor > 0 1     Xor -> 0 0
*/

public class FindingUniqueElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<>();
        while (true)
        {
            System.out.print("Enter data : ");int x = sc.nextInt();
            if(x == 0)break;
            ar.add(x);
        }
        System.out.print("Unique Element in the given array is : " + getUniqueElement(ar, ar.size()));
    }

    private static int getUniqueElement(ArrayList<Integer> ar, int n) {
        int exOr = 0;
        for(int x:ar)exOr ^= x;
        return exOr;
    }
}

package BitWise;
import java.util.*;

/*
*       Test Cases : i/p ---> [11, 12, 14, 15]                          i/p --> [1, 2, 3, 4, 5, 7, 8, 9]
*                    o/p ---> Missing Element in the given set is : 13  o/p --> Missing Element in the given set is : 6

                    * Example : [1, 2, 4, 5]
                    * we will be taking 1st element as base exOr i.e, exOr = 1
                    * then we will be traversing entire Array by exOr'ing array

                    * 1 --> 0 1  2 --> 1 0  4 --> 1 0 0  5 --> 1 0 1
                    *exOr > 0 1 exOr-> 1 1 exOr > 0 1 0 exOr > 0 0 1
                    * ans ->1 1  ans-> 1 0  ans > 0 0 1 ans -> 0 1 1 ---> 3 (final) So this is our Missing Element
*/

public class FindingMissingElementInGivenSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<>();
        while (true)
        {
            System.out.print("Enter data : ");int x = sc.nextInt();
            if(x == 0)break;
            ar.add(x);
        }
        System.out.print("Missing Element in the given set is : " + getMissingElement(ar, ar.size()));
    }

    private static int getMissingElement(ArrayList<Integer> ar, int n) {
        int exOr = ar.get(0);
        for(int x:ar)exOr ^= x;
        return exOr;
    }
}

package DSA.Searchings.BinarySearchAndApplications;
import java.util.*;

/*
*  Test Cases : i/p ---> [4 5 6 7 1 2 3]
*               o/p ---> 4
*       explanation ---> actual Array is -> 1 2 3 4 5 6 7 from this 4 5 6 7 are rotated so 4 rotations.
*                        1st rotation --> 7 1 2 3 4 5 6   2nd rotation --> 6 7 1 2 3 4 5
*                        3rd rotation --> 5 6 7 1 2 3 4   4th rotation --> 4 5 6 7 1 2 3
* */

public class CountingRotations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar =  new ArrayList<>();
        while (true)
        {
            System.out.print("Enter data : ");int x = sc.nextInt();
            if(x == 0)break;
            ar.add(x);
        }
        System.out.print("Number of Rotations are : " + getNumberOfRotations(ar, ar.size()));
    }

    private static int getNumberOfRotations(ArrayList<Integer> ar, int n) {
        int pInd = 0;
        for(int i=0;i<n-1;i++)
            if(ar.get(i) > ar.get(i+1))
            {
                pInd = i;
                break;
            }
        if(pInd != 0)return pInd+1;
        return 0;
    }
}

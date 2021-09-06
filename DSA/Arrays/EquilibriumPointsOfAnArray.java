package DSA.Arrays;
import java.util.*;

/*
* Test case :  i/p ----> -7, 1, 5, 2, -4, 3, 0
*              o/p ----> 2
*              explanation ----> (sum of the elements to its right) = (sum of elements to its right)
*                                   -7 + 1 + 5 = -4 + 3 + 0
*                                           1  =  1
*                                such elements are called equilibrium points of the array
* */

public class EquilibriumPointsOfAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<>();
        while(true)
        {
            System.out.print("Enter data : ");int x = sc.nextInt();
            if(x == 0)break;
            ar.add(x);
        }
        System.out.print("Equilibrium points of the array are : " + FindEquiPoints(ar,ar.size()));
    }

    static ArrayList<Integer> FindEquiPoints(ArrayList<Integer> ar, int n) {
        int tot = 0,left = 0,right = 0;
        for(int num:ar)tot += num;
        ArrayList<Integer> equi = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            tot -= ar.get(i);
            if(tot == left)equi.add(ar.get(i));
            left += ar.get(i);
        }
        return equi;
    }
}

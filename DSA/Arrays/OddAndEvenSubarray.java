package DSA.Arrays;
import java.util.*;

/*
* TestCase : i/p ---> 1, 2, 3, 4, 5, 7, 9
*            o/p ---> 5
*    explanation ---> The sub array {1, 2, 3, 4, 5} has alternating even and odd elements.
*/

public class OddAndEvenSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<>();
        while(true)
        {
            System.out.print("Enter data : ");int x = sc.nextInt();
            if(x == 0)break;
            ar.add(x);
        }
        System.out.print("Maximum length of OddEvenSub array is : " + GetLenOfMaxOddEven(ar, ar.size()));
    }

    private static int GetLenOfMaxOddEven(ArrayList<Integer> ar, int n) {
        int c = 1;
        int maxi = 1;
        for(int i=0;i<n-1;i++)
        {
            if((ar.get(i)%2 == 0 && ar.get(i+1)%2 != 0) || (ar.get(i)%2 != 0 && ar.get(i+1)%2 == 0))
            {
                c++;
                maxi = Math.max(maxi,c);
            }
            else c = 1;
        }
        return maxi;
    }
}

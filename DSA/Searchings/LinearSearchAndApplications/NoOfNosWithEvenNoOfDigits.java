package DSA.Searchings.LinearSearchAndApplications;
import java.util.*;

/*
 * Test Cases : i/p --->  21 344 45 667722 123 4567
 *              o/p ---> 21 45 667722 4567
*/

public class NoOfNosWithEvenNoOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<>();
        while (true)
        {
            System.out.print("Enter data : ");int x = sc.nextInt();
            if(x == 0)break;
            ar.add(x);
        }
        System.out.print("Numbers with even number of digits are : ");
        getEvenNumberDigits(ar, ar.size());
    }

    private static void getEvenNumberDigits(ArrayList<Integer> ar, int n) {
        for(int i=0;i<n;i++)
        {
            if(getNumberOfDigits(ar.get(i)) % 2 != 0) System.out.print(ar.get(i) + " ");
        }
    }

    private static int getNumberOfDigits(int n) {
        if(n < 0)n *= -1;
        return (int) Math.log10(n);
    }
}

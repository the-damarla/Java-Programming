package DSA.Arrays;
import java.util.*;

/*
* TestCase : i/p ---> 2 5 9 7
*            o/p ---> 2 9 5 7
*    explanation ---> 2 -> 0010    ----->   1
*                     5 -> 0101    ----->   2
*                     9 -> 1001    ----->   2
*                     7 -> 0111    ----->   3
*/

public class SegregateAccordingToNoOfSetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> ar = new ArrayList<>();
        while(true)
        {
            System.out.print("Enter data : ");String x = sc.nextLine();
            if(x.compareTo("0") == 0)break;
            ar.add(x);
        }
        System.out.print("Array After Bit Segregation : " + GetSegBits(ar, ar.size()));
    }

    private static ArrayList<String> GetSegBits(ArrayList<String> ar, int n) {
        Collections.sort(ar, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int one = Integer.parseInt(o1);
                int two = Integer.parseInt(o2);
                int c1 = 0,c2 = 0;
                while(one > 0)
                {
                    one &= (one-1);c1++;
                }
                while(two > 0)
                {
                    two &= (two-1);c2++;
                }
                if(c1 > c2)return 1;
                return -1;
            }
        });
        return ar;
    }
}

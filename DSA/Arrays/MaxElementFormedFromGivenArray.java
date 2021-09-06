package DSA.Arrays;
import java.util.*;

/*
* TestCase :   i/p ---> 10, 68, 75, 7, 21, 12
*              o/p ---> 77568211210
* */

public class MaxElementFormedFromGivenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> ar = new ArrayList<>();
        while(true)
        {
            System.out.print("Enter data : ");String x = sc.nextLine();
            if(x.compareTo("0") == 0)break;
            ar.add(x);
        }
        System.out.print("Max number can be formed from given array is : ");
        GetMaxForm(ar,ar.size());
    }

    static void GetMaxForm(ArrayList<String> ar, int n) {
        Collections.sort(ar, new Comparator<String>() {
            @Override
            public int compare(String one, String two) {
                String XY = one+two;
                String YX = two+one;
                return XY.compareTo(YX) > 0 ? -1 : 1;
            }
        });
        for(String x:ar)System.out.print(x);
    }
}

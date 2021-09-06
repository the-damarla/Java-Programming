package DSA.Arrays;
import java.util.*;

/*
* TestCase : i/p --->  vijay, sai, nag, damarla
*            o/p ---> [nag, sai, vijay, damarla]
*/

public class SortingStringsAccordingToTheirsSizes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> ar = new ArrayList<>();
        while(true)
        {
            System.out.print("Enter Data : ");String s = sc.nextLine();
            if(s.compareTo("0") == 0)break;
            ar.add(s);
        }
        System.out.print("After Sorting strings according to their sizes : " + GetSortSizes(ar));
    }

    private static ArrayList<String> GetSortSizes(ArrayList<String> ar) {
        ar.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int one = o1.length();
                int two = o2.length();
                if (one > two) return 1;
                return -1;
            }
        });
        return ar;
    }
}

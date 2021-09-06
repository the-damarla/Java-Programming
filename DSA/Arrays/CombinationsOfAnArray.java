package DSA.Arrays;
import java.util.*;

/*
 * TestCase : i/p ---> a, b, c
 *            o/p ---> {}, {a}, {b}, {c}, {a,b}, {a, c}, {b, c}, {a, b, c}
 *            This is also called as the PowerSet of the given array, So this is
 *            Combinations of the given Array as well as PowerSet of the Array.
*/

public class CombinationsOfAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String > ar = new ArrayList<>();
        while (true)
        {
            System.out.print("Enter data : ");String  x = sc.nextLine();
            if(x.compareTo("0") == 0)break;
            ar.add(x);
        }
        System.out.println("Possible Combinations for the given Array is : ");
        for(int i=1;i<ar.size();i++)
        {
            ArrayList<String> data = new ArrayList<>(Collections.nCopies(i,"0"));
            Collections.fill(data,"0");
            GetCombos(ar,ar.size(),i,data);
        }
    }

    private static void GetCombos(ArrayList<String > ar, int n,int r,ArrayList<String> data) {
        GetCombinations(ar,n,r,0,data,0);
    }

    private static void GetCombinations(ArrayList<String> ar, int n, int r, int index, ArrayList<String> data, int i) {
        if(index == r)
        {
            for(String x:data)System.out.print(x + " ");
            System.out.println();
            return;
        }
        if(i >= n)return;
        data.set(index,ar.get(i));
        GetCombinations(ar,n,r,index+1,data,i+1);
        GetCombinations(ar,n,r,index,data,i+1);
    }
}

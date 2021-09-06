package DSA.Arrays;
import java.util.*;

/*
* TestCase : i/p ---> 1 2 3 4 5 6 7 8 9
*            o/p ---> [2, 4, 6, 8, 5, 3, 7, 1, 9]
* */

public class SegregateEvenAndOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<>();
        while(true)
        {
            System.out.print("enter data : ");int x = sc.nextInt();
            if(x == 0)break;
            ar.add(x);
        }
        System.out.print("Array after segregation  : " + GetSegArray(ar, ar.size()));
    }

    private static ArrayList<Integer> GetSegArray(ArrayList<Integer> ar, int n) {
        int c = 0;
        for(int i=0;i<n;i++)
        {
            if(ar.get(i)%2 == 0)
            {
                Swap(ar,c,i);
                c++;
            }
        }
        return ar;
    }

    private static void Swap(ArrayList<Integer> ar, int c, int i) {
        int temp = ar.get(i);
        ar.set(i,ar.get(c));
        ar.set(c,temp);
    }
}

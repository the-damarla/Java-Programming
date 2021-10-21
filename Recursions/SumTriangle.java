package Recursions;
import java.util.*;

/*
Input : A = {1, 2, 3, 4, 5}
Output : [48]
         [20, 28]
         [8, 12, 16]
         [3, 5, 7, 9]
         [1, 2, 3, 4, 5]

Explanation :
Here,   [48]
        [20, 28] -->(20 + 28 = 48)
        [8, 12, 16] -->(8 + 12 = 20, 12 + 16 = 28)
        [3, 5, 7, 9] -->(3 + 5 = 8, 5 + 7 = 12, 7 + 9 = 16)
        [1, 2, 3, 4, 5] -->(1 + 2 = 3, 2 + 3 = 5, 3 + 4 = 7, 4 + 5 = 9)
*/

public class SumTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<>();
        while (true)
        {
            System.out.print("Enter data : ");int x = sc.nextInt();
            if(x == 0)break;
            ar.add(x);
        }
        getSumTriangle(ar, ar.size());
    }

    private static void getSumTriangle(ArrayList<Integer> ar, int n) {
        if(n < 1)return;
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i=1;i<n;i++)temp.add(ar.get(i-1) + ar.get(i));
        getSumTriangle(temp,temp.size());
        for(int i=0;i<n;i++)System.out.print(ar.get(i) + " ");
        System.out.print("\n");
    }
}

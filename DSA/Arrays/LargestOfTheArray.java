package DSA.Arrays;
import java.util.*;
public class LargestOfTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<>();
        while(true)
        {
            System.out.print("Enter data : ");int x = sc.nextInt();
            if(x == 0)break;
            ar.add(x);
        }
        System.out.println("Max element in the given array is : " + Collections.max(ar));
        System.out.print("Minimum Element in the given array is : " + Collections.min(ar));
    }
}

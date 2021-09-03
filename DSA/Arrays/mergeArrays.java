package DSA.Arrays;
import java.util.*;
public class mergeArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> one = new ArrayList<>();
        ArrayList<Integer> two = new ArrayList<>();
        System.out.print("enter 1st Array elements : \n");
        while(true)
        {
            System.out.print("enter data : ");int x = sc.nextInt();
            if(x == 0)break;
            one.add(x);
        }
        System.out.print("enter 2nd Array elements : \n");
        while(true)
        {
            System.out.print("enter data : ");int x = sc.nextInt();
            if(x == 0)break;
            two.add(x);
        }
        int n = two.size(),i=0;
        while(i < n)
        {
            one.add(two.get(i));
            i++;
        }
        System.out.print("Merged Array is : " + one);
    }
}

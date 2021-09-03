package DSA;
import java.util.*;
public class AvgOfGivenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<>();
        while(true)
        {
            System.out.print("Enter an element : ");int x = sc.nextInt();
            if(x == 0)break;
            ar.add(x);
        }
        System.out.print("Average of the given data is : " + Average(ar,ar.size()));
    }

    private static int Average(ArrayList<Integer> ar, int size) {
        int sum = 0;
        for(int i=0;i<size;i++)sum += ar.get(i);
        return sum/size;
    }
}

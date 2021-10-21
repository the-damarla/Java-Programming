package Basics;
import java.util.*;
public class SumNaturalRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter start range : ");int start = sc.nextInt();
        System.out.print("enter end range : ");int end = sc.nextInt();
        System.out.print("Sum of numbers between range is : " + RecurSum(start,end,0));
    }

    static int RecurSum(int start, int end, int sum) {
        if(start == end)return (sum+start);
        return RecurSum(start+1,end,sum+=start);
    }
}

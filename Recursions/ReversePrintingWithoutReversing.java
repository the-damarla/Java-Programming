package Recursions;
import java.util.*;

public class ReversePrintingWithoutReversing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> ar = new ArrayList<>();
        while (true)
        {
            System.out.print("Enter data : ");char ch = sc.next().charAt(0);
            if(ch == '0')break;
            ar.add(ch);
        }
        printReverse(ar, ar.size(), 0);
    }

    private static void printReverse(ArrayList<Character> ar, int n, int s) {
        if(s >= n)return;
        printReverse(ar,n,s+1);
        System.out.print(ar.get(s) + " ");
    }
}

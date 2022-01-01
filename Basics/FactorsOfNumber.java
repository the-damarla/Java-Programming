package Basics;
import java.util.*;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");int num = sc.nextInt();
        System.out.print("Factors of " + num + " : " + getFactorsWithNaive(num));
        System.out.print("Factors of " + num + " : " + getFactorsEfficiently(num));;
    }

    private static Set<Integer> getFactorsEfficiently(int num) {            //Time Complexity : O(sqrt(n))
        SortedSet<Integer> st = new TreeSet<>();
        for(int i=1;i<=Math.sqrt(num);i++)
        {
            if(num % i == 0)
                if(num/i == i)st.add(i);
                else
                {
                    st.add(i);
                    st.add(num/i);
                }
        }
        return st;
    }

    private static ArrayList<Integer> getFactorsWithNaive(int num) {        //Time Complexity : O(n)
        ArrayList<Integer> ar = new ArrayList<>();
        for(int i=1;i<=num;i++)
            if(num%i == 0)ar.add(i);
        return ar;
    }
}

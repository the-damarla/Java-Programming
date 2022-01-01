package DSA.General;
import java.util.*;

public class SieveOfErastosthenesMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number till where u want Prime Numbers : ");int n = sc.nextInt();
        ArrayList<Boolean> ar = new ArrayList<>(n+1);
        for(int i=0;i<n;i++)ar.add(false);
        System.out.print("Primes till " + n + " are : " + getPrimesWithSieve(ar, ar.size()));
    }

    private static ArrayList<Integer> getPrimesWithSieve(ArrayList<Boolean> ar, int n) {
        for(int i=2;i*i<n;i++)
            if(!ar.get(i))
                for(int j=i*2;j<n;j+=i)
                    ar.set(j,true);

        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=2;i<n;i++)
            if(!ar.get(i))
                ans.add(i);
        return ans;
    }
}

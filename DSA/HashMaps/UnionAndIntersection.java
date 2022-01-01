package DSA.HashMaps;
import java.util.*;

public class UnionAndIntersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar1 = new ArrayList<>();
        ArrayList<Integer> ar2 = new ArrayList<>();
        System.out.println("  Enter the data for 1st array  \'Enter \"0\" to stop giving input\'");
        while (true)
        {
            System.out.print("Enter data : ");int x = sc.nextInt();
            if(x == 0)break;
            ar1.add(x);
        }
        System.out.println("  Enter the data for 2nd array  \'Enter \"0\" to stop giving input\'");
        while (true)
        {
            System.out.print("Enter data : ");int x = sc.nextInt();
            if(x == 0)break;
            ar2.add(x);
        }
        System.out.println("Union of given two arrays is : " + getUnionOfArrays(ar1, ar2));
        System.out.println("Intersection of given two arrays is : " + getIntersection(ar1, ar2));
    }

    private static ArrayList<Integer> getIntersection(ArrayList<Integer> ar1, ArrayList<Integer> ar2) {
        HashSet<Integer> st = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(Integer i:ar1)st.add(i);
        for(Integer i:ar2) if(st.contains(i))ans.add(i);
        return ans;
    }

    private static ArrayList<Integer> getUnionOfArrays(ArrayList<Integer> ar1, ArrayList<Integer> ar2) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(Integer i:ar1)mp.put(i,mp.get(i) == null ? 1 : mp.get(i)+1);
        for(Integer i:ar2)mp.put(i,mp.get(i) == null ? 1 : mp.get(i)+1);
        for(Map.Entry<Integer,Integer> i:mp.entrySet())ans.add(i.getKey());
        return ans;
    }
}

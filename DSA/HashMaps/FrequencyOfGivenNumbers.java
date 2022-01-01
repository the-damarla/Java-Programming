package DSA.HashMaps;
import java.util.*;

public class FrequencyOfGivenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<>();
        while (true)
        {
            System.out.print("Enter data : ");int x = sc.nextInt();
            if(x == 0)break;
            ar.add(x);
        }
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
        for (Integer integer : ar) mp.put(integer, (mp.get(integer) == null ? 1 : mp.get(integer) + 1));
        for(HashMap.Entry<Integer,Integer> entry:mp.entrySet()) System.out.println(entry.getKey() + " " + entry.getValue());
    }
}

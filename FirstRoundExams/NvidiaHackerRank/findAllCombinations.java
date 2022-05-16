package FirstRoundExams.NvidiaHackerRank;
import java.util.*;

/*
    * Given a binary String consists of '?' in between, that '?' can be placed with '0' or '1',
    * So get all the combinations by placing '0' or '1' in the place of '?'
    * After getting all combinations it has to be converted to decimal and to the descending order
            * Example :- i/p => 10?11
            * possible outcomes are => 10011 10111
            *                           19    23
            * Desired o/p => [23, 19]
*/

public class findAllCombinations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary String : ");
        String input = sc.nextLine();
        ArrayList<String> ans = new ArrayList<>();
        for(char ch:input.toCharArray()) {
            ans = getAllCombinations(ch, ans);
        }
        ArrayList<Integer> result = new ArrayList<>();
        System.out.println(ans);
        for(int i=0;i<ans.size();i++) {
            result.add(Integer.parseInt(ans.get(i),2));
        }
        System.out.println(result);
        Collections.reverse(result);
        System.out.println(result);
    }

    private static ArrayList<String> getAllCombinations(char input, ArrayList<String> baseAnswer) {
        ArrayList<String> localAnswer = new ArrayList<>();
        if(baseAnswer.size() <= 0) {
            if(input == '?') {
                localAnswer.add("0");
                localAnswer.add("1");
            }
            else {
                localAnswer.add(input + "");
            }
        }
        else {
            for(int i=0;i<baseAnswer.size();i++)
            {
                if(input == '?') {
                    localAnswer.add(baseAnswer.get(i) + "0");
                    localAnswer.add(baseAnswer.get(i) + "1");
                }
                else {
                    localAnswer.add(baseAnswer.get(i) + input);
                }
            }
        }
        return localAnswer;
    }
}

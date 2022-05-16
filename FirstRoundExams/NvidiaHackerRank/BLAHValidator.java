package FirstRoundExams.NvidiaHackerRank;
import java.util.*;

/*
    * BLAH is language contains English alphabet and follows two rules
    * 1-> Letters in the words must be in increasing sequence
    * 2-> the difference between the adjacent letters must also be in the ascending order
    * Example :- degit -> order of d and e is 0 (i.e, zero number of words in between d and e)
    *                              e and g is 1
    *                              g and i is 4
    *                              i and t is 7
    *                     So this is a valid string in BLAH language
    *            adeh -> order of a and d is 2
    *                             d and e is 0
    *                             e and h is 2
    *            though the letters are in increasing order but the order is not in ascending order
    *            So this is not a valid string
*/

public class BLAHValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter \'0\' to stop giving input");
        ArrayList<String> inputs = new ArrayList<>();
        while(true) {
            System.out.print("Enter a string : ");
            String temp = sc.nextLine();
            if(temp.length() == 1 && temp.charAt(0) == '0') {
                break;
            }
            else {
                inputs.add(temp);
            }
        }
        ArrayList<Boolean> storeValues = new ArrayList<>();
        for(String i:inputs) {
            storeValues.add(validateString(i));
        }
        for(int i=0;i<storeValues.size();i++) {
            if(storeValues.get(i)) {
                System.out.println(inputs.get(i));
            }
        }
    }

    private static boolean validateString(String input) {
        int maxi = (input.charAt(1) - input.charAt(0));
        boolean flag = true;
        for(int i=1;i<input.length();i++) {
//            System.out.println(input.charAt(i) + " - " + input.charAt(i-1) + " = " + (input.charAt(i) - input.charAt(i-1)));
            if(input.charAt(i) < input.charAt(i-1) || maxi > ((input.charAt(i) - input.charAt(i-1)))) {
                flag = false;
                break;
            }
            else {
                maxi = (input.charAt(i) - input.charAt(i-1));
            }
        }
        return flag;
    }
}

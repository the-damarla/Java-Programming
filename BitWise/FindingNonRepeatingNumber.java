package BitWise;
import java.util.*;

/*
        *-->* This intuition can be applicable only when every number in the array is repeating uniform number of times
        *-->* And Only one number that didn't get repeated will be our answer

        Test Case :   i/p ---> [1, 2, 3, 2, 1]
                      o/p ---> 3

                      Explanation : As every number is repeating twice
                                    but 3 didn't get repeated.
                      Intuition : number   binary
                                    1        0 1
                                    2        1 0
                                    3        1 1
                                    2        1 0
                                    1        0 1
                                          ---------
                                    Sum ---> 3 3
                                             % %
               No Of repetitions are : 2  -> 2 2
                                          ---------
                                             1 1 --->(Binary Form) ---> Decimal Form is "3"
                                          ---------
              The number that didn't repeat is "3".
*/

public class FindingNonRepeatingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<>();
        int sum = 0;
        while (true)
        {
            System.out.print("Enter Data : ");int x = sc.nextInt();
            if(x == 0)break;
            ar.add(x);
            sum += Integer.parseInt(Integer.toBinaryString(x));
        }
        System.out.print("Enter number of repetitions of each number : ");int rep = sc.nextInt();
        for(int y:ar)System.out.print("\n" + y + " BinaryForm ----> " + Integer.toBinaryString(y) + "\n");
        System.out.print("                 --------");
        System.out.print("\nSum Of Binary Numbers : " + sum);
        System.out.print("\nFinally the missing number is : " + Integer.parseInt(getAnswer(sum,"",rep),2));
    }

    private static String getAnswer(int sum, String ans, int rep) {
        while (sum > 0)
        {
            int temp = sum % 10;
            ans += temp % rep;
            sum /= 10;
        }
        return getReverse(ans);
    }

    private static String getReverse(String ans) {
        int last = ans.length() - 1;
        String finAns = "";
        while (last >= 0)
        {
            finAns += ans.charAt(last);
            last--;
        }
        System.out.print("\nAfter dividing Each number with No. Of repetitions : " + finAns);
        return finAns;
    }
}

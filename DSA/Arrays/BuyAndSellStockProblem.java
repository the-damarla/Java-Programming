package DSA.Arrays;
import java.util.*;

/*
* TestCase : i/p ---> 100, 180, 260, 310, 40, 535, 695
*            o/p ---> Maximum Profit can be made is : 865
*                     MaxProfit can be made in Intra Day Trading : 655
*/

public class BuyAndSellStockProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<>();
        while (true)
        {
            System.out.print("Enter data : ");int x = sc.nextInt();
            if(x == 0)break;
            ar.add(x);
        }
        System.out.print("Maximum Profit can be made is : " + GetMaxProfit(ar, ar.size()));
        System.out.print("\nMaxProfit can be made in Intra Day Trading : " + GetIntraDayProfit(ar, ar.size()));
    }

/*
You want to maximize your profit by choosing a single day to buy one stock and choosing
a different day in the future to sell that stock. Return the maximum profit you can achieve
from this transaction. If you cannot achieve any profit, return 0.
*/

    private static int GetIntraDayProfit(ArrayList<Integer> ar, int n) {
        int mini = ar.get(0),profit = 0;
        for(int i=0;i<n;i++)
        {
            mini = Math.min(mini,ar.get(i));
            if(mini < ar.get(i))
            {
                profit = Math.max(profit, (ar.get(i) - mini));
            }
        }
        return profit;
    }

/*
Find the maximum profit you can achieve. You may complete as many transactions as you like
(i.e., buy one and sell one share of the stock multiple times).
Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).
*/

    private static int GetMaxProfit(ArrayList<Integer> ar, int n) {
        int profit = 0;
        for(int i=1;i<n;i++)
        {
            if(ar.get(i) > ar.get(i-1))profit += (ar.get(i) - ar.get(i-1));
        }
        return profit;
    }
}

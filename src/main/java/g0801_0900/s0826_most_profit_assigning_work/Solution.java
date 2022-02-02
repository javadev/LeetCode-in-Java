package g0801_0900.s0826_most_profit_assigning_work;

// #Medium #Array #Sorting #Greedy #Binary_Search #Two_Pointers

public class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int n = 100000;
        int[] maxProfit = new int[n];

        for (int i = 0; i < difficulty.length; i++) {
            maxProfit[difficulty[i]] = Math.max(maxProfit[difficulty[i]], profit[i]);
        }

        for (int i = 1; i < n; i++) {
            maxProfit[i] = Math.max(maxProfit[i], maxProfit[i - 1]);
        }

        int sum = 0;
        for (int efficiency : worker) {
            sum += maxProfit[efficiency];
        }
        return sum;
    }
}

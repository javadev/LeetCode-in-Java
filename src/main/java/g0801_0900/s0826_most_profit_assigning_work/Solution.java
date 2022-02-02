package g0801_0900.s0826_most_profit_assigning_work;

// #Medium #Array #Sorting #Greedy #Binary_Search #Two_Pointers

public class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int N = 100000;
        int[] max_profit = new int[N];
		
        for (int i=0; i<difficulty.length; i++) {
            max_profit[difficulty[i]] = Math.max(max_profit[difficulty[i]], profit[i]);
        }

        for (int i=1; i<N; i++) {
            max_profit[i] = Math.max(max_profit[i], max_profit[i-1]);
        }
        
        int sum=0;
        for (int efficiency:worker) {
            sum += max_profit[efficiency];
        }
        return sum;
    }
}
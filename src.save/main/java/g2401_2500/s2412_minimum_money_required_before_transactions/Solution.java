package g2401_2500.s2412_minimum_money_required_before_transactions;

// #Hard #Array #Sorting #Greedy #2022_11_15_Time_4_ms_(97.57%)_Space_98_MB_(87.50%)

public class Solution {
    public long minimumMoney(int[][] transactions) {
        int max = 0;
        long sum = 0;
        for (int[] transaction : transactions) {
            int diff = transaction[1] - transaction[0];
            if (diff < 0) {
                sum -= diff;
                transaction[0] += diff;
            }
            max = Math.max(max, transaction[0]);
        }
        return max + sum;
    }
}

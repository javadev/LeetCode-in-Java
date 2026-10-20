package g3901_4000.s3946_maximum_number_of_items_from_sale_i;

// #Medium #Array #Dynamic_Programming #Greedy #Staff #Weekly_Contest_504
// #2026_10_20_Time_13_ms_(100.00%)_Space_46.50_MB_(96.15%)

public class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        int n = items.length;
        int maxFactor = 0;
        int minPrice = Integer.MAX_VALUE;
        // Find the maximum factor (for our frequency array) and the minimum price
        for (int[] item : items) {
            maxFactor = Math.max(maxFactor, item[0]);
            minPrice = Math.min(minPrice, item[1]);
        }
        // Count frequencies of each factor
        int[] freq = new int[maxFactor + 1];
        for (int[] item : items) {
            freq[item[0]]++;
        }
        // Precompute how many free items we get by buying at least 1 copy of item i
        int[] free = new int[n];
        for (int i = 0; i < n; i++) {
            int f = items[i][0];
            int count = 0;
            // Sum up the frequencies of all multiples of factor f
            for (int mult = f; mult <= maxFactor; mult += f) {
                count += freq[mult];
            }
            // Subtract 1 because we shouldn't count the item itself as a free copy
            free[i] = count - 1;
        }
        // 0-1 Knapsack DP
        // dp[c] stores the max items we can get by spending exactly 'c' budget to activate items
        int[] dp = new int[budget + 1];
        java.util.Arrays.fill(dp, -1);
        dp[0] = 0;
        for (int i = 0; i < n; i++) {
            int weight = items[i][1];
            int value = 1 + free[i];
            for (int c = budget; c >= weight; c--) {
                if (dp[c - weight] != -1) {
                    dp[c] = Math.max(dp[c], dp[c - weight] + value);
                }
            }
        }
        // Evaluate the best combination of activated items + leftover budget spent on cheapest
        // items
        int maxTotal = 0;
        for (int c = 0; c <= budget; c++) {
            if (dp[c] != -1) {
                // dp[c] gives us the activation items.
                // We buy the cheapest item repeatedly with the remaining budget.
                int currentTotal = dp[c] + (budget - c) / minPrice;
                maxTotal = Math.max(maxTotal, currentTotal);
            }
        }
        return maxTotal;
    }
}

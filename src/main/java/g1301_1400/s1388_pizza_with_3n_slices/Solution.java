package g1301_1400.s1388_pizza_with_3n_slices;

// #Hard #Array #Dynamic_Programming #Greedy #Heap_Priority_Queue
// #2022_03_17_Time_5_ms_(93.33%)_Space_42.4_MB_(88.57%)

public class Solution {
    public int maxSizeSlices(int[] slices) {
        int n = slices.length;
        int third = n / 3;
        return Math.max(
                maxSizeSlices(slices, 0, n - 2, third), maxSizeSlices(slices, 1, n - 1, third));
    }

    private int maxSizeSlices(int[] slices, int start, int end, int parts) {
        int[] dp = new int[slices.length];
        int res = 0;
        for (int i = 0; i < parts; i++) {
            int prev = 0;
            int prevPrev = 0;
            for (int j = end; j >= start; j--) {
                int curr = dp[j];
                dp[j] = slices[j] + prevPrev;
                prevPrev = prev;
                prev = Math.max(curr, prev);
                res = Math.max(res, dp[j]);
            }
        }
        return res;
    }
}

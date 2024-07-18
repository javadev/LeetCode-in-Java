package g3201_3300.s3219_minimum_cost_for_cutting_cake_ii;

// #Hard #Array #Sorting #Greedy #2024_07_18_Time_3_ms_(100.00%)_Space_62.6_MB_(25.82%)

public class Solution {
    private static final int N = 1001;
    private static final int[] HORIZONTAL_COUNTS = new int[N];
    private static final int[] VERTICAL_COUNTS = new int[N];

    public long minimumCost(int m, int n, int[] horizontalCut, int[] verticalCut) {
        int max = 0;
        for (int x : horizontalCut) {
            if (x > max) {
                max = x;
            }
            HORIZONTAL_COUNTS[x]++;
        }
        for (int x : verticalCut) {
            if (x > max) {
                max = x;
            }
            VERTICAL_COUNTS[x]++;
        }
        long ans = 0;
        int horizontalCount = 1;
        int verticalCount = 1;
        for (int x = max; x > 0; x--) {
            ans += (long) HORIZONTAL_COUNTS[x] * x * horizontalCount;
            verticalCount += HORIZONTAL_COUNTS[x];
            HORIZONTAL_COUNTS[x] = 0;
            ans += (long) VERTICAL_COUNTS[x] * x * verticalCount;
            horizontalCount += VERTICAL_COUNTS[x];
            VERTICAL_COUNTS[x] = 0;
        }
        return ans;
    }
}

package g3201_3300.s3219_minimum_cost_for_cutting_cake_ii;

// #Hard #Array #Sorting #Greedy #2024_07_18_Time_3_ms_(100.00%)_Space_62.6_MB_(25.82%)

@SuppressWarnings("java:S1172")
public class Solution {
    private static final int N = 1001;
    private int[] horizontalCounts = new int[N];
    private int[] verticalCounts = new int[N];

    public long minimumCost(int m, int n, int[] horizontalCut, int[] verticalCut) {
        int max = 0;
        for (int x : horizontalCut) {
            if (x > max) {
                max = x;
            }
            horizontalCounts[x]++;
        }
        for (int x : verticalCut) {
            if (x > max) {
                max = x;
            }
            verticalCounts[x]++;
        }
        long ans = 0;
        int horizontalCount = 1;
        int verticalCount = 1;
        for (int x = max; x > 0; x--) {
            ans += (long) horizontalCounts[x] * x * horizontalCount;
            verticalCount += horizontalCounts[x];
            horizontalCounts[x] = 0;
            ans += (long) verticalCounts[x] * x * verticalCount;
            horizontalCount += verticalCounts[x];
            verticalCounts[x] = 0;
        }
        return ans;
    }
}

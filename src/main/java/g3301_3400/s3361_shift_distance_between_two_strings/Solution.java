package g3301_3400.s3361_shift_distance_between_two_strings;

// #Medium #Array #String #Prefix_Sum #2024_12_03_Time_9_ms_(100.00%)_Space_45.8_MB_(36.02%)

public class Solution {
    public long shiftDistance(String s, String t, int[] nextCost, int[] previousCost) {
        long[][] costs = new long[26][26];
        long cost;
        for (int i = 0; i < 26; i++) {
            cost = nextCost[i];
            for (int j = (i == 25 ? 0 : i + 1); j != i; j++) {
                costs[i][j] = cost;
                cost += nextCost[j];
                if (j == 25) {
                    j = -1;
                }
            }
        }
        for (int i = 0; i < 26; i++) {
            cost = previousCost[i];
            for (int j = (i == 0 ? 25 : i - 1); j != i; j--) {
                costs[i][j] = Math.min(costs[i][j], cost);
                cost += previousCost[j];
                if (j == 0) {
                    j = 26;
                }
            }
        }
        int n = s.length();
        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += costs[s.charAt(i) - 'a'][t.charAt(i) - 'a'];
        }
        return ans;
    }
}

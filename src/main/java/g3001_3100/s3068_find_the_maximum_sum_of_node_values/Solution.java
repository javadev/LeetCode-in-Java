package g3001_3100.s3068_find_the_maximum_sum_of_node_values;

// #Hard #Array #Dynamic_Programming #Sorting #Greedy #Tree #Bit_Manipulation
// #2024_03_31_Time_1_ms_(100.00%)_Space_54.5_MB_(67.07%)

@SuppressWarnings("java:S1172")
public class Solution {
    public long maximumValueSum(int[] nums, int k, int[][] edges) {
        long res = 0;
        int d = 1 << 30;
        int c = 0;
        for (int a : nums) {
            int b = a ^ k;
            res += Math.max(a, b);
            c ^= a < b ? 1 : 0;
            d = Math.min(d, Math.abs(a - b));
        }
        return res - d * c;
    }
}

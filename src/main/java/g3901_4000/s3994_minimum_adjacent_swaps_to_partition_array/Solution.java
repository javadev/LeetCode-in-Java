package g3901_4000.s3994_minimum_adjacent_swaps_to_partition_array;

// #Medium #Array #Greedy #Staff #Biweekly_Contest_187
// #2026_11_17_Time_6_ms_(80.28%)_Space_101.87_MB_(61.97%)

public class Solution {
    public int minAdjacentSwaps(int[] nums, int a, int b) {
        long ans = 0;
        long c1 = 0;
        long c2 = 0;
        for (int v : nums) {
            if (v < a) {
                ans += c1 + c2;
            } else if (v <= b) {
                c1++;
                ans += c2;
            } else {
                c2++;
            }
        }
        return (int) (ans % 1000000007);
    }
}

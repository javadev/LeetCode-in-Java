package g1801_1900.s1862_sum_of_floored_pairs;

// #Hard #Array #Math #Binary_Search #Prefix_Sum
// #2022_05_08_Time_115_ms_(70.91%)_Space_57.2_MB_(81.82%)

import java.util.Arrays;

public class Solution {
    public int sumOfFlooredPairs(int[] nums) {
        long mod = 1000000007;
        Arrays.sort(nums);
        int max = nums[nums.length - 1];
        int[] counts = new int[max + 1];
        long[] qnts = new long[max + 1];
        for (int k : nums) {
            counts[k]++;
        }
        for (int i = 1; i < max + 1; i++) {
            if (counts[i] == 0) {
                continue;
            }
            int j = i;
            while (j <= max) {
                qnts[j] += counts[i];
                j = j + i;
            }
        }
        for (int i = 1; i < max + 1; i++) {
            qnts[i] = (qnts[i] + qnts[i - 1]) % mod;
        }
        long sum = 0;
        for (int k : nums) {
            sum = (sum + qnts[k]) % mod;
        }
        return (int) sum;
    }
}

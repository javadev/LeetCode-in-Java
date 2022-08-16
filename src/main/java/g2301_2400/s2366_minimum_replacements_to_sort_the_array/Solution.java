package g2301_2400.s2366_minimum_replacements_to_sort_the_array;

// #Hard #Array #Math #Greedy #2022_08_16_Time_5_ms_(92.03%)_Space_81_MB_(63.44%)

public class Solution {
    public long minimumReplacement(int[] nums) {
        long ret = 0L;
        int n = nums.length;
        int last = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] <= last) {
                last = nums[i];
                continue;
            }
            if (nums[i] % last == 0) {
                // split into nums[i] / last elements, operations cnt = nums[i] / last - 1;
                ret += nums[i] / last - 1;
            } else {
                // split into k elements  operations cnt = k - 1;
                // ceil
                int k = nums[i] / last + 1;
                ret += k - 1;
                // left most element max is nums[i] / k
                last = nums[i] / k;
            }
        }
        return ret;
    }
}

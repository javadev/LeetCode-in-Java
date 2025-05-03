package g2301_2400.s2366_minimum_replacements_to_sort_the_array;

// #Hard #Array #Math #Greedy #2025_05_03_Time_3_ms_(98.58%)_Space_56.46_MB_(8.49%)

public class Solution {
    public long minimumReplacement(int[] nums) {
        int n = nums.length;
        int prev = nums[n - 1];
        long ans = 0;
        for (int i = n - 2; i >= 0; i--) {
            int noOfTime = nums[i] / prev;
            if (nums[i] % prev != 0) {
                noOfTime++;
                prev = nums[i] / noOfTime;
            }
            ans += noOfTime - 1;
        }
        return ans;
    }
}

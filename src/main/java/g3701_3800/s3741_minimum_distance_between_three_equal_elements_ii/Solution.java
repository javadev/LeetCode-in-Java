package g3701_3800.s3741_minimum_distance_between_three_equal_elements_ii;

// #Medium #Array #Hash_Table #Senior #Weekly_Contest_475
// #2026_04_26_Time_6_ms_(99.60%)_Space_161.24_MB_(96.23%)

public class Solution {
    public int minimumDistance(int[] nums) {
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        int[] prev1 = new int[n + 1];
        int[] prev2 = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            prev1[i] = prev2[i] = -1;
        }

        for (int i = 0; i < n; i++) {
            int value = nums[i];
            if (prev2[value] != -1) {
                ans = Math.min(ans, (i - prev2[value]));
            }
            prev2[value] = prev1[value];
            prev1[value] = i;
        }
        if (ans < 100002) return ans * 2;
        return -1;
    }
}

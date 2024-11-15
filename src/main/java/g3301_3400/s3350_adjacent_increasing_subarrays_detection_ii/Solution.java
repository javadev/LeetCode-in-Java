package g3301_3400.s3350_adjacent_increasing_subarrays_detection_ii;

// #Medium #Array #Binary_Search #2024_11_15_Time_10_ms_(99.76%)_Space_90.6_MB_(30.61%)

import java.util.List;

public class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int n = nums.size();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            a[i] = nums.get(i);
        }
        int ans = 1;
        int previousLen = Integer.MAX_VALUE;
        int i = 0;
        while (i < n) {
            int j = i + 1;
            while (j < n && a[j - 1] < a[j]) {
                ++j;
            }
            int len = j - i;
            ans = Math.max(ans, len / 2);
            if (previousLen != Integer.MAX_VALUE) {
                ans = Math.max(ans, Math.min(previousLen, len));
            }
            previousLen = len;
            i = j;
        }
        return ans;
    }
}

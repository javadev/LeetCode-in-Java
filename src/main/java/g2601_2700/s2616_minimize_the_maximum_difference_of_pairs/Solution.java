package g2601_2700.s2616_minimize_the_maximum_difference_of_pairs;

// #Medium #Array #Greedy #Binary_Search #2023_08_30_Time_16_ms_(91.77%)_Space_58.7_MB_(90.15%)

import java.util.Arrays;

public class Solution {
    private boolean isPossible(int[] nums, int p, int diff) {
        int n = nums.length;
        int i = 1;
        while (i < n) {
            if (nums[i] - nums[i - 1] <= diff) {
                p--;
                i++;
            }
            i++;
        }
        return p <= 0;
    }

    public int minimizeMax(int[] nums, int p) {
        int n = nums.length;
        Arrays.sort(nums);
        int left = 0;
        int right = nums[n - 1] - nums[0];
        int ans = right;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (isPossible(nums, p, mid)) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}

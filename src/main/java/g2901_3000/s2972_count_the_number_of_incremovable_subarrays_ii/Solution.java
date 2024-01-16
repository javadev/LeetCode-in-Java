package g2901_3000.s2972_count_the_number_of_incremovable_subarrays_ii;

// #Hard #Array #Binary_Search #Two_Pointers #2024_01_16_Time_1_ms_(100.00%)_Space_57.8_MB_(66.47%)

public class Solution {
    public long incremovableSubarrayCount(int[] nums) {
        long ans = 0;
        int n = nums.length;
        int l = 0;
        int r = n - 1;
        while (l + 1 < n && nums[l] < nums[l + 1]) {
            l++;
        }
        while (r > 0 && nums[r - 1] < nums[r]) {
            r--;
        }
        ans = (l == n - 1) ? 0 : 1 + (n - r);
        for (int i = 0; i <= l; i++) {
            while (r < n && nums[r] <= nums[i]) {
                r++;
            }
            ans += n - r + 1;
        }
        return ans;
    }
}

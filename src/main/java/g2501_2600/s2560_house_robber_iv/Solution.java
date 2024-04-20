package g2501_2600.s2560_house_robber_iv;

// #Medium #Array #Binary_Search #2023_08_21_Time_16_ms_(98.78%)_Space_59.8_MB_(60.98%)

public class Solution {
    public int minCapability(int[] nums, int k) {
        int lo = Integer.MAX_VALUE;
        int hi = Integer.MIN_VALUE;
        for (int it : nums) {
            lo = Math.min(lo, it);
            hi = Math.max(hi, it);
        }
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (check(nums, k, mid)) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    private boolean check(int[] nums, int k, int val) {
        int ct = 0;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] <= val) {
                i++;
                ct++;
                if (ct == k) {
                    return true;
                }
            }
            i++;
        }
        return ct >= k;
    }
}

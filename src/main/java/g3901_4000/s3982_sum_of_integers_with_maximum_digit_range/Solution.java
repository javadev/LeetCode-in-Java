package g3901_4000.s3982_sum_of_integers_with_maximum_digit_range;

// #Easy #Array #Math #Mid_Level #Weekly_Contest_509
// #2026_11_03_Time_2_ms_(57.34%)_Space_44.91_MB_(80.07%)

public class Solution {
    public int maxDigitRange(int[] nums) {
        int n = nums.length;
        int[] range = nums.clone();
        int maxRange = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int x = range[i];
            int mn = Integer.MAX_VALUE;
            int mx = Integer.MIN_VALUE;
            while (x > 0) {
                int d = x % 10;
                mn = Math.min(mn, d);
                mx = Math.max(mx, d);
                x /= 10;
            }
            range[i] = mx - mn;
            maxRange = Math.max(maxRange, range[i]);
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (range[i] == maxRange) {
                ans += nums[i];
            }
        }
        return ans;
    }
}

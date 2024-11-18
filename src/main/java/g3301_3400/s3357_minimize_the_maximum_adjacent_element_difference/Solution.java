package g3301_3400.s3357_minimize_the_maximum_adjacent_element_difference;

// #Hard #2024_11_18_Time_5_ms_(100.00%)_Space_58.9_MB_(100.00%)

public class Solution {
    public int minDifference(int[] nums) {
        int n = nums.length;
        int maxAdj = 0;
        int mina = Integer.MAX_VALUE;
        int maxb = Integer.MIN_VALUE;
        for (int i = 0; i < n - 1; ++i) {
            int a = nums[i];
            int b = nums[i + 1];
            if (a > 0 && b > 0) {
                maxAdj = Math.max(maxAdj, Math.abs(a - b));
            } else if (a > 0 || b > 0) {
                mina = Math.min(mina, Math.max(a, b));
                maxb = Math.max(maxb, Math.max(a, b));
            }
        }
        int res = 0;
        for (int i = 0; i < n; ++i) {
            if ((i > 0 && nums[i - 1] == -1) || nums[i] > 0) {
                continue;
            }
            int j = i;
            while (j < n && nums[j] == -1) {
                j++;
            }
            int a = Integer.MAX_VALUE;
            int b = Integer.MIN_VALUE;
            if (i > 0) {
                a = Math.min(a, nums[i - 1]);
                b = Math.max(b, nums[i - 1]);
            }
            if (j < n) {
                a = Math.min(a, nums[j]);
                b = Math.max(b, nums[j]);
            }
            if (a <= b) {
                if (j - i == 1) {
                    res = Math.max(res, Math.min(maxb - a, b - mina));
                } else {
                    res =
                            Math.max(
                                    res,
                                    Math.min(
                                            maxb - a,
                                            Math.min(b - mina, (maxb - mina + 2) / 3 * 2)));
                }
            }
        }
        return Math.max(maxAdj, (res + 1) / 2);
    }
}

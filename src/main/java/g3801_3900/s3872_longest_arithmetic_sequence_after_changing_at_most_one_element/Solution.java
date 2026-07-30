package g3801_3900.s3872_longest_arithmetic_sequence_after_changing_at_most_one_element;

// #Medium #Array #Enumeration #Staff #Weekly_Contest_493
// #2026_07_28_Time_11_ms_(100.00%)_Space_145.68_MB_(86.52%)

public class Solution {
    public int longestArithmetic(int[] nums) {
        int ans = solve(nums);
        reverse(nums);
        return Math.max(ans, solve(nums));
    }

    private static int solve(int[] nums) {
        int n = nums.length;
        int max = 2;
        int diff = nums[1] - nums[0];
        int left = 0;
        for (int right = 2; right < n; right++) {
            if (nums[right] - nums[right - 1] == diff) {
                max = Math.max(max, right - left + 1);
                continue;
            }
            int temp = right;
            int val = nums[right - 1] + diff;
            while (temp + 1 < n && nums[temp + 1] - val == diff) {
                val = nums[++temp];
            }
            max = Math.max(max, temp - left + 1);
            left = right - 1;
            diff = nums[right] - nums[right - 1];
        }
        return max;
    }

    private static void reverse(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            int temp = nums[i];
            nums[i++] = nums[j];
            nums[j--] = temp;
        }
    }
}

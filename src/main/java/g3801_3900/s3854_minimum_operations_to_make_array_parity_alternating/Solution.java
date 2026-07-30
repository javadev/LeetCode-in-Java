package g3801_3900.s3854_minimum_operations_to_make_array_parity_alternating;

// #Medium #Array #Greedy #Staff #Biweekly_Contest_177
// #2026_07_27_Time_9_ms_(100.00%)_Space_146.36_MB_(88.24%)

public class Solution {
    public int[] makeParityAlternating(int[] nums) {
        if (nums.length == 1) {
            return new int[] {0, 0};
        }
        int zero = 0;
        int one = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] & 1) != (i & 1)) {
                zero++;
            }
            if ((nums[i] & 1) != ((i + 1) & 1)) {
                one++;
            }
        }
        int[] ans = new int[2];
        ans[0] = Math.min(one, zero);
        if (one == zero) {
            ans[1] = Math.min(fun(nums, 0), fun(nums, 1));
        } else if (one > zero) {
            ans[1] = fun(nums, 0);
        } else {
            ans[1] = fun(nums, 1);
        }
        return ans;
    }

    private int fun(int[] nums, int parity) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] & 1) == ((i + parity) & 1)) {
                max = Math.max(max, nums[i]);
                min = Math.min(min, nums[i]);
            } else {
                max = Math.max(max, nums[i] - 1);
                min = Math.min(min, nums[i] + 1);
            }
        }
        return Math.max(max - min, 1);
    }
}

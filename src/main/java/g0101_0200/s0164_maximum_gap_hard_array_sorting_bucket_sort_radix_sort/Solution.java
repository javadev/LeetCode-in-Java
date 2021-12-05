package g0101_0200.s0164_maximum_gap_hard_array_sorting_bucket_sort_radix_sort;

import java.util.Arrays;

public class Solution {
    public int maximumGap(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }

        int ret = Integer.MIN_VALUE;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if ((nums[i + 1] - nums[i]) > ret) {
                ret = (nums[i + 1] - nums[i]);
            }
        }

        return ret;
    }
}
